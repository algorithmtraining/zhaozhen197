public class MaxProfit{

    /**
     * 动态规划：
     *用mincost保存遍历时候的最小值，该最小值就是股票买入的价格。
     * 初始状态 dp[0] =0;
     * 转移方程: dp[i] = max(dp[i-1],prices[i]-mincost)
     * 结果：dp[prices.length-1];
     */
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length ==0){
            return 0;
        }
        int minCost = prices[0];
        int[] dp = new int[prices.length];
        dp[0] = 0;
        for (int i=1;i<prices.length;i++) {
            if(prices[i]<minCost){
                minCost = prices[i];
            }

            dp[i] = Math.max(dp[i-1], prices[i]-minCost);
        }

        return dp[prices.length-1];
    }
}