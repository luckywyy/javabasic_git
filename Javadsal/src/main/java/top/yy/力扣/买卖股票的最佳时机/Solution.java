package top.yy.力扣.买卖股票的最佳时机;

/**
 * @program: javabasic_git
 * @description:
 * @author:
 * @create: 2021-12-16 09:48
 **/
public class Solution {
    public int maxProfit(int[] prices) {

        int max_ = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                int interest = prices[j] - prices[i];
                if (interest > max_) {
                    max_ = interest;
                }
            }
        }

        if (max_ < 0) {
            max_ = 0;
        }

        return max_;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
