class Solution {
    public int maxProfit(int[] prices) {
        // int buy=prices[0],ans=0;
        // for(int i=1; i<prices.length; i++){
        //     ans=Math.max(ans,prices[i]-buy);
        //     buy=Math.min(buy,prices[i]);
        // }
        // return ans;
        
        return  maxProfit(1,prices);
    }
    public int maxProfit(int k, int[] prices) {
        int n=prices.length,m=2;
        int dp_after[][]=new int[m][k+1];
        int dp_cur[][]=new int[m][k+1];
        // for(int buy=0; buy<m; buy++){
        //     for(int cap=0; cap<k; cap++){
        //         dp[n][buy][cap]=0;
        //     }
        // }
        // for(int i=0; i<=n; i++){
        //     for(int buy=0; buy<m; buy++){
        //         dp[i][buy][0]=0;
        //     }
        // }
        for(int i=n-1; i>=0; i--){
            for(int buy=0; buy<=1; buy++){
                for(int cap=1; cap<=k; cap++){
                        int profit=0;
                        if(buy==1){
                            profit=Math.max(-prices[i]+dp_after[0][cap],0+dp_after[1][cap]);
                        }else{
                            profit=Math.max(prices[i]+dp_after[1][cap-1],0+dp_after[0][cap]);
                        }
                        dp_cur[buy][cap]=profit;
                    }
            }
            dp_after=dp_cur;
        }
        return dp_after[1][k];
    }
}