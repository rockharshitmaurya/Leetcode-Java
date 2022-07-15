class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0],ans=0;
        for(int i=1; i<prices.length; i++){
            ans=Math.max(ans,prices[i]-buy);
            buy=Math.min(buy,prices[i]);
        }
        return ans;
    }
}