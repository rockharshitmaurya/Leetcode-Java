class Solution {
    public int coinChange(int[] coins, int amount) {
        // int ans= helper(coins,amount,coins.length-1);
        // if(ans>=(int)1e9) return -1;
        int n=coins.length;
        int dp[][]= new int[n][amount+1];
        for(int amt=1; amt<=amount; amt++) dp[0][amt]=(amt%coins[0])==0?(amt/coins[0]):(int)1e9;
        
        for(int i=1; i<n; i++){
            for(int amt=1; amt<=amount; amt++){
                int take=(int)1e9;
                if(coins[i]<=amt) take=1+dp[i][amt-coins[i]];
                int notTake=dp[i-1][amt];
                dp[i][amt]=Math.min(take,notTake);
            }
        }
        int ans=dp[n-1][amount];
        if(ans>=(int)1e9) return -1;
        return ans;
    }
    int helper(int coins[],int amount,int idx){
        if(idx==0){
            if(amount%coins[idx]==0) return amount/coins[idx];
            return (int)1e9;
        }
        int take=(int)1e9;
        if(coins[idx]<=amount) take=1+helper(coins,amount-coins[idx],idx);
        int notTake=helper(coins,amount,idx-1);
        return Math.min(take,notTake);
    }
}