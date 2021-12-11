package top.yy.力扣.最大子数组和;

import java.lang.annotation.Native;
import java.util.Arrays;


class Solution {
    public int maxSubArray(int[] nums) {

        int sums[] = new int[nums.length];
        /**
         * 用Integer类的MIN_VALUE表示极小值
         */
        int max_ = Integer.MIN_VALUE; // @Native public static final int   MIN_VALUE = 0x80000000;
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 0) {
            return 0;
        }
        sums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sums[i] = Math.max(sums[i-1]+nums[i], nums[i]);
            if (sums[i] > max_) {
                max_ = sums[i];
            }
        }

        if (sums[0] > max_) {
            max_ = sums[0];
        }

        return max_;
    }

    public static void main(String[] args) {


        System.out.println(new Solution().maxSubArray(new int[]{-1, -2}));
    }
}
