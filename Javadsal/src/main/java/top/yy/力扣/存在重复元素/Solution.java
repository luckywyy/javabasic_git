package top.yy.力扣.存在重复元素;

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean flag = true;
        HashSet<Integer> hashSet = new HashSet<Integer>();

        for (int e : nums) {
            if (!hashSet.add(e)) {
                flag = false;
                break;
            }
        }


        return flag;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 2, 1};
        System.out.println(a);

        System.out.println(new Solution().containsDuplicate(a));
    }
}