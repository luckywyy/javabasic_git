package top.yy.力扣.二分查找;

/**
 * @program: javabasic_git-top.yy.力扣.二分查找
 * @description:
 * 输入: nums = [-1,0,3,5,9,12], target = 9
 * 输出: 4
 * 解释: 9 出现在 nums 中并且下标为 4
 *
 * 输入: nums = [-1,0,3,5,9,12], target = 2
 * 输出: -1
 * 解释: 2 不存在 nums 中因此返回 -1
 * @author:
 * @create: 2021-12-28 19:20
 **/
public class Solution {
    public int search(int[] nums, int target) {
        if (target<nums[0] || target > nums[nums.length-1]) {
            return -1;
        }
        int ret = -1;

        int left = 0;
        int right = nums.length-1;
        int mid = (left + right) / 2;

        while (nums[mid] != target) {
            if (left == right) {
                break;
            }
            int temp_ = nums[mid];
            if (temp_ < target) {
                left = mid+1;
//                right = right;
                mid = (left + right) / 2;
            } else {
//                left = left;
                right = mid-1;
                mid = (left + right) / 2;
            }
        }

        if (nums[mid] == target) {
            ret = mid;
        }
        return ret;

    }
    public int binarySearch(int[] nums, int target, int left, int right, int mid) {
        return 0;
    }
    public static void main(String[] args) {

        int[] nums = new int[]{2, 5};
        int target = 0;
        System.out.println(new Solution().search(nums, target));
    }
}
