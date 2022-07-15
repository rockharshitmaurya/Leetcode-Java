class Solution {
    public int maxProfit(int[] price) {
        int n=price.length;
        int dp[][]=new int[n+2][2]; //n+2 size because dp[idx+2][1]; this line will be coverd
        for(int idx=n-1; idx>=0; idx--){
            for(int buy=0; buy<=1; buy++){
                    int profit=0;
                    if(buy==1){
                        profit=Math.max(-price[idx]+dp[idx+1][0],0+dp[idx+1][1]);
                    }else{
                        profit=Math.max(price[idx]+dp[idx+2][1],0+dp[idx+1][0]);
                    }
                dp[idx][buy]=profit;
            }
        }
        return dp[0][1];
    }
    int helper(int price[],int idx,int buy){
        if(idx>=price.length) return 0;
        
        int profit=0;
        if(buy==1){
            profit=Math.max(-price[idx]+helper(price,idx+1,0),0+helper(price,idx+1,1));
        }else{
            profit=Math.max(price[idx]+helper(price,idx+2,1),0+helper(price,idx+1,0));
        }
        return profit;
    }
}