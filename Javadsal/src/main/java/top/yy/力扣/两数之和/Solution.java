package top.yy.力扣.两数之和;

import java.util.ArrayList;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];

    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,7,11,15};
        int target = 9;
        for (int i : new Solution().twoSum(arr, target)) {
            System.out.println(i);
        }


    }
}
