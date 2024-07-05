package dev.alexengrig.leetcode._657_robot_return_to_origin;

class Solution implements Task {
    @Override
    public boolean judgeCircle(String moves) {
        int row = 0, col = 0;
        for (char move : moves.toCharArray()) {
            switch (move) {
                case 'U' -> row--;
                case 'D' -> row++;
                case 'L' -> col--;
                case 'R' -> col++;
            }
        }
        return row == 0 && col == 0;
    }
}
