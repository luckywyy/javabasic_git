package top.yy.力扣.拿硬币;

class Solution {
    public int minCount(int[] coins) {
        int total = 0;
        for (int e:
             coins) {
            total += e / 2;
            total += e % 2;
        }

        return total;
    }

    public static void main(String[] args) {

        System.out.println(new Solution().minCount(new int[]{2, 3, 10}));
    }
}