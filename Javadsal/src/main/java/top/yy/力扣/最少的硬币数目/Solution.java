package top.yy.力扣.最少的硬币数目;

class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1]; // 这里我们使用数组dp[i]表示i金额需要的coins数量

        for (int i = 0; i < dp.length; i++) {
            if ( i==0 ) {
                dp[i] = 0; // 0金额需要0个
                continue;
            }
            // 其他情况
            dp[i] = Integer.MAX_VALUE;
            // 剩下的金额循环coins
            for (int j = 0; j < coins.length; j++) {
                /**
                 * 这段代码也就是公式
                 */
                if ( i - coins[j] >= 0 && dp[i - coins[j]] != Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i - coins[j]] + 1, dp[i]);
                }
            }
        }

        return dp[amount];

    }

    public static void main(String[] args) {
        System.out.println(new Solution().coinChange(new int[]{1, 2, 5}, 11));
    }
}