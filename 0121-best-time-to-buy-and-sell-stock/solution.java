class Solution {
    public int maxProfit(int[] prices) {
        int buy=-1,sell=-1,Xbuy= Integer.MAX_VALUE,Xprofit=0;
        for(int ele:prices){
            Xbuy=Math.min(Xbuy,ele);
            int profit=ele-Xbuy;
            Xprofit=Math.max(Xprofit,profit);
        }return Xprofit;
    }
}
