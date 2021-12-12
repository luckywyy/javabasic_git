package top.yy.力扣.最大子数组和;

import java.util.Arrays;


class Solution2 {
    public int maxSubArray(int[] nums) {

        int sums[] = new int[nums.length];
        /**
         * 用Integer类的MIN_VALUE表示极小值
         */
        int max_ = Integer.MIN_VALUE; // @Native public static final int   MIN_VALUE = 0x80000000;
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            // 初始情况 边界吧
            if (i == 0) {
                sums[i] = nums[i];
                max_ = sums[i];
                continue;
            }
            sums[i] = Math.max(sums[i-1]+nums[i], nums[i]);
            if (sums[i] > max_) {
                max_ = sums[i];
            }
        }

        return max_;
    }

    public static void main(String[] args) {


        System.out.println(new Solution().maxSubArray(new int[]{-1, -2, -9999, 999, 9001}));
    }
}
