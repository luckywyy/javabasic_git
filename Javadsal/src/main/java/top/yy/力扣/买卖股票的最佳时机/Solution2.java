package top.yy.力扣.买卖股票的最佳时机;

/**
 * @program: javabasic_git
 * @description:
 * @author:
 * @create: 2021-12-16 09:48
 **/
public class Solution2 {
    public int maxProfit(int[] prices) {

        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        System.out.println(new Solution2().maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
