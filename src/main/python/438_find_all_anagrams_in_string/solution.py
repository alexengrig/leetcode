from typing import List, Counter

from task import Task


class Solution(Task):
    def findAnagrams(self, s: str, p: str) -> List[int]:
        res = []
        len_s, len_p = len(s), len(p)
        if len_s < len_p:
            return res
        cnt_s, cnt_p = Counter(s[:len_p - 1]), Counter(p)
        for r in range(len_p - 1, len_s):
            cnt_s[s[r]] += 1
            l = r - len_p + 1
            if cnt_s == cnt_p:
                res.append(l)
            l_ch = s[l]
            cnt_s[l_ch] -= 1
            if cnt_s[l_ch] == 0:
                cnt_s.pop(l_ch)
        return res
