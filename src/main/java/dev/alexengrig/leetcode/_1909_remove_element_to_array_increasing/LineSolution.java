package dev.alexengrig.leetcode._1909_remove_element_to_array_increasing;

class LineSolution implements Task {
    @Override
    public boolean canBeIncreasing(int[] nums) {
        if (nums.length < 3) {
            return nums[0] != nums[1];
        }
        for (int prev = 0, curr = 1, next = 2, fails = 0; next < nums.length; prev++, curr++, next++) {
            if (nums[prev] < nums[curr] && nums[curr] < nums[next]) continue;
            if (nums[prev] > nums[next]) {
                fails++;
            }
            if (nums[prev] == nums[next]) {
                return false;
            }
            if (fails > 1) {
                return false;
            }
        }
        return true;
    }

    public boolean canBeIncreasing1(int[] nums) {
        int fails, max;
        if (nums[0] < nums[1]) {
            fails = 0;
            max = nums[0];
        } else {
            fails = 1;
            max = nums[1];
        }
        boolean check = false;
        for (int curr = 1, next = 2; next < nums.length & fails < 2; curr++, next++) {
            if (nums[curr] < nums[next]) {
                max = nums[curr];
                check = false;
            } else {
                if (max >= nums[next]) {
                    // curr can't be removed
                    check = false;
                }
                fails++;
            }
        }
        return fails < 2;

        //2, 3, 1, 2
        //m=2
        //3 < 1 false
        // 2 > 1 return false
        //105, 924, 32, 968
        //m=105
        //924 < 32
        //
    }
}
