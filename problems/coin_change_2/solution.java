class Solution {
    int dp[][];
    public int change(int amount, int[] coins) {
        dp = new int[coins.length][amount+1];
        // for(int arr[]:dp) Arrays.fill(arr,-1);
        for(int am=0; am<=amount; am++){
            if(am%coins[0]==0) 
                dp[0][am] = 1; 
        }
        for(int idx=1; idx<coins.length; idx++){
            for(int am=0; am<=amount; am++){
                int take=0;
                if(coins[idx]<=am) take=dp[idx][am-coins[idx]];
                int notTake=dp[idx-1][am];
                dp[idx][am]=(take+notTake);
            }
        }
        // return helper(coins,amount,coins.length-1,"");
        return dp[coins.length-1][amount];
    }
    int helper(int coins[],int amount,int idx,String ans){
        if(idx==0){
            if(amount%coins[idx]==0) return 1; 
            return 0;
        }
        if(dp[idx][amount]!=-1) return dp[idx][amount];
        int take=0;
        if(coins[idx]<=amount) take=helper(coins,amount-coins[idx],idx,ans+" "+coins[idx]);
        int notTake=helper(coins,amount,idx-1,ans);
        return dp[idx][amount]=(take+notTake);
    }
}