class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int j = 0;
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < prices[j]) {
                j = i;
            }
            int profit = prices[i] - prices[j];
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}