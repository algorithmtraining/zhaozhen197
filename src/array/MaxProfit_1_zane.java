package array;

public class MaxProfit_1_zane {
    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] pricess = {};
        System.out.println(maxProfit(pricess));
    }

    /**
     * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
     *
     * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
     *
     * 注意你不能在买入股票前卖出股票。
     * NO.121.一次遍历，用时2ms.
     *
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {

        int profit = 0;
        int maxProfit = 0;
        if (prices.length <= 0) {
            return maxProfit;
        }
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            } else {
                profit = prices[i] - min;
                if (maxProfit < profit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

}
