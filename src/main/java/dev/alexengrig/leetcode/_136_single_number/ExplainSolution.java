package dev.alexengrig.leetcode._136_single_number;

class ExplainSolution implements Task {
    public static void main(String[] args) {
        ExplainSolution solution = new ExplainSolution();
        int[] nums = {4, 1, 2, 1, 2};
        solution.singleNumber(nums);
    }

    @Override
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            System.out.println(res + " ^ " + num + " = " + (res ^ num));
            System.out.println(Integer.toBinaryString(res) + " ^ " + Integer.toBinaryString(num) +
                               " = " + Integer.toBinaryString(res ^ num));
            System.out.println();
            res = res ^ num;
        }
        return res;
    }
}
