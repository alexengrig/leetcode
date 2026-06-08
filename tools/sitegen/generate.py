from __future__ import annotations

import re
import shutil
from dataclasses import dataclass
from pathlib import Path
from typing import Any

import yaml


ROOT = Path(__file__).resolve().parents[2]
PROBLEMS_DIR = ROOT / "problems"
DOCS_DIR = ROOT / "site-docs"


COMPLEXITY_RE = re.compile(
    r"^\s*(?://|#)\s*(Time|Space):\s*(.+?)\s*$",
    re.IGNORECASE,
)


@dataclass(frozen=True)
class Solution:
    language: str
    name: str
    path: Path
    relative_path: str
    time: str
    space: str


@dataclass(frozen=True)
class Trace:
    name: str
    path: Path
    relative_path: str


def main() -> None:
    recreate_docs_dir()

    problems = load_problems()

    write_home_page(problems)
    write_problems_index(problems)

    for problem_dir, problem in problems:
        write_problem_page(problem_dir, problem)


def recreate_docs_dir() -> None:
    if DOCS_DIR.exists():
        shutil.rmtree(DOCS_DIR)

    (DOCS_DIR / "problems").mkdir(parents=True, exist_ok=True)


def load_problems() -> list[tuple[Path, dict[str, Any]]]:
    if not PROBLEMS_DIR.exists():
        return []

    result: list[tuple[Path, dict[str, Any]]] = []

    for problem_dir in sorted(PROBLEMS_DIR.iterdir()):
        if not problem_dir.is_dir():
            continue

        problem_file = problem_dir / "problem.yml"
        if not problem_file.exists():
            continue

        problem = yaml.safe_load(problem_file.read_text(encoding="utf-8"))

        required_fields = ["id", "slug", "title", "leetcode_url", "difficulty"]
        missing = [field for field in required_fields if field not in problem]
        if missing:
            raise ValueError(f"{problem_file} is missing required fields: {missing}")

        result.append((problem_dir, problem))

    return result


def write_home_page(problems: list[tuple[Path, dict[str, Any]]]) -> None:
    lines = [
        "# LeetCode Solutions",
        "",
        "Generated site with solutions, notes, and traces.",
        "",
        "## Stats",
        "",
        f"- Problems: {len(problems)}",
        "",
        "## Navigation",
        "",
        "- [Problems](problems/index.md)",
        "",
    ]

    (DOCS_DIR / "index.md").write_text("\n".join(lines), encoding="utf-8")


def write_problems_index(problems: list[tuple[Path, dict[str, Any]]]) -> None:
    lines = [
        "# Problems",
        "",
        "| # | Title | Difficulty | Topics |",
        "|---:|---|---|---|",
    ]

    for problem_dir, problem in problems:
        page_name = problem_page_name(problem_dir)
        topics = ", ".join(problem.get("topics", []))
        lines.append(
            f"| {problem['id']} | [{problem['title']}]({page_name}) | "
            f"{problem['difficulty']} | {topics} |"
        )

    lines.append("")

    (DOCS_DIR / "problems" / "index.md").write_text(
        "\n".join(lines),
        encoding="utf-8",
    )


def write_problem_page(problem_dir: Path, problem: dict[str, Any]) -> None:
    solutions = detect_solutions(problem_dir)
    traces = detect_traces(problem_dir)
    notes_file = problem_dir / "notes.md"

    lines: list[str] = [
        f"# {problem['id']}. {problem['title']}",
        "",
        f"- Difficulty: `{problem['difficulty']}`",
        f"- LeetCode: [{problem['leetcode_url']}]({problem['leetcode_url']})",
    ]

    topics = problem.get("topics", [])
    if topics:
        lines.append(f"- Topics: {', '.join(f'`{topic}`' for topic in topics)}")

    lines.extend(["", "## Solutions", ""])

    if solutions:
        lines.extend(render_solutions_table(solutions))
        lines.append("")

        for solution in solutions:
            lines.extend(render_solution(problem_dir, solution))
            lines.append("")
    else:
        lines.append("_No solutions detected._")
        lines.append("")

    if notes_file.exists():
        lines.extend(["## Notes", ""])
        lines.append(notes_file.read_text(encoding="utf-8").strip())
        lines.append("")

    if traces:
        lines.extend(["## Traces", ""])
        for trace in traces:
            lines.extend(render_trace(trace))
            lines.append("")

    output = DOCS_DIR / "problems" / problem_page_name(problem_dir)
    output.write_text("\n".join(lines), encoding="utf-8")


def detect_solutions(problem_dir: Path) -> list[Solution]:
    result: list[Solution] = []

    java_dir = problem_dir / "java"
    if java_dir.exists():
        for path in sorted(java_dir.glob("*Solution.java")):
            result.append(
                Solution(
                    language="java",
                    name=java_solution_name(path),
                    path=path,
                    relative_path=path.relative_to(problem_dir).as_posix(),
                    **parse_complexity(path),
                )
            )

    python_dir = problem_dir / "python"
    if python_dir.exists():
        for path in sorted(python_dir.glob("*_solution.py")):
            result.append(
                Solution(
                    language="python",
                    name=python_solution_name(path),
                    path=path,
                    relative_path=path.relative_to(problem_dir).as_posix(),
                    **parse_complexity(path),
                )
            )

    return result


def detect_traces(problem_dir: Path) -> list[Trace]:
    traces_dir = problem_dir / "traces"
    if not traces_dir.exists():
        return []

    result: list[Trace] = []

    for path in sorted(traces_dir.glob("*.md")):
        result.append(
            Trace(
                name=title_from_slug(path.stem),
                path=path,
                relative_path=path.relative_to(problem_dir).as_posix(),
            )
        )

    return result


def parse_complexity(path: Path) -> dict[str, str]:
    time = None
    space = None

    lines = path.read_text(encoding="utf-8").splitlines()

    for line in lines[:20]:
        match = COMPLEXITY_RE.match(line)
        if not match:
            continue

        kind = match.group(1).lower()
        value = match.group(2).strip()

        if kind == "time":
            time = value
        elif kind == "space":
            space = value

    if time is None or space is None:
        raise ValueError(
            f"{path} must start with complexity comments, for example:\n"
            f"// Time: O(n)\n"
            f"// Space: O(n)"
        )

    return {"time": time, "space": space}


def render_solutions_table(solutions: list[Solution]) -> list[str]:
    lines = [
        "| Language | Approach | Time | Space | File |",
        "|---|---|---:|---:|---|",
    ]

    for solution in solutions:
        lines.append(
            f"| {solution.language} | {solution.name} | `{solution.time}` | "
            f"`{solution.space}` | `{solution.relative_path}` |"
        )

    return lines


def render_solution(problem_dir: Path, solution: Solution) -> list[str]:
    language = "java" if solution.language == "java" else "python"
    code = solution.path.read_text(encoding="utf-8").rstrip()

    return [
        f"### {solution.name} — {solution.language}",
        "",
        f"Time: `{solution.time}`  ",
        f"Space: `{solution.space}`",
        "",
        f"```{language} title=\"{solution.relative_path}\"",
        code,
        "```",
    ]


def render_trace(trace: Trace) -> list[str]:
    content = trace.path.read_text(encoding="utf-8").strip()

    return [
        f"### {trace.name}",
        "",
        content,
    ]


def problem_page_name(problem_dir: Path) -> str:
    return f"{problem_dir.name}.md"


def java_solution_name(path: Path) -> str:
    name = path.stem
    if name.endswith("Solution"):
        name = name[: -len("Solution")]

    return split_camel_case(name)


def python_solution_name(path: Path) -> str:
    name = path.stem
    if name.endswith("_solution"):
        name = name[: -len("_solution")]

    return title_from_slug(name.replace("_", "-"))


def split_camel_case(value: str) -> str:
    value = re.sub(r"(?<!^)(?=[A-Z])", " ", value)
    return value.strip() or "Solution"


def title_from_slug(value: str) -> str:
    return value.replace("_", "-").replace("-", " ").title()


if __name__ == "__main__":
    main()
