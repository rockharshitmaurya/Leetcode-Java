class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        
        int prev_dp[]=new int[2];
        int cur_dp[]=new int[2];
        
        for(int i=n-1; i>=0; i--){
            for(int buy=0; buy<=1; buy++){
                int profit=0;
                if(buy==1){
                    profit=Math.max(-(prices[i]+fee)+prev_dp[0],0+prev_dp[1]);
                }else{
                    profit=Math.max(prices[i]+prev_dp[1],0+prev_dp[0]);
                }
                cur_dp[buy]=profit;
            }
            prev_dp=cur_dp;
        }
        return prev_dp[1];
    }
}