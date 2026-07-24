class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minCost = prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minCost) minCost=prices[i];
            profit=Math.max(profit,prices[i]-minCost);
        }if(profit<=0) return 0;
        else return profit;
    }
}
