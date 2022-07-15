class Solution {
    int dp[][];
    public int maxProfit(int[] prices) {
        dp=new int[prices.length+1][2];
        int n=prices.length;
        dp[n][0]=0; dp[n][1]=0;
        // for(int arr[]:dp) Arrays.fill(arr,-1);
        // return helper(prices,0,true);
        for(int idx=n-1; idx>=0; idx--){
            for(int buy=0; buy<=1; buy++){
                int profit=0;
                if(buy==1){
                    profit=Math.max(-prices[idx]+dp[idx+1][0],0+dp[idx+1][1]);
                }else{
                    profit=Math.max(prices[idx]+dp[idx+1][1],0+dp[idx+1][0]);
                }
                dp[idx][buy]=profit; 
            }
        }
        return dp[0][1];
    }
    int helper(int arr[],int idx,boolean buy){
        if(idx==arr.length) return 0;
        int j=buy==true?1:0;
        if(dp[idx][j]!=-1) return dp[idx][j];
        int profit=0;
        if(buy){
            profit=Math.max(-arr[idx]+helper(arr,idx+1,false),0+helper(arr,idx+1,true));
        }else{
            profit=Math.max(arr[idx]+helper(arr,idx+1,true),0+helper(arr,idx+1,false));
        }
        return dp[idx][j]=profit;
    }
}