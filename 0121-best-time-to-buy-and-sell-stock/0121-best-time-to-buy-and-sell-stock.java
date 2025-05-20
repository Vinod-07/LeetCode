class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int sell = Integer.MIN_VALUE;
        for(int i = 0; i < prices.length; i++){
            buy = Math.min(prices[i], buy);
            sell = Math.max(prices[i] - buy, sell);
        }
        return sell;
    }
}