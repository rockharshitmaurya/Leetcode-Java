class Solution {
    public boolean stoneGame(int[] piles) {
        // int sum=0,n=piles.length;
        // for(int num:piles) sum+=num;
        // int dp[][]=new int[n+1][n+1];
        // for(int arr[]:dp) 
        //     Arrays.fill(arr,-1);
        // return (sum/2)<=helper(piles,dp,0,n-1);
        return true;
    }
    int helper(int piles[],int dp[][],int i,int j){
        if(i>=j) return 0;
        
        if(dp[i][j]!=-1) return dp[i][j];
        
        int front=piles[i]+Math.min(helper(piles,dp,i+2,j),helper(piles,dp,i+1,j-1));
        int back=piles[j]+Math.min(helper(piles,dp,i+1,j-1),helper(piles,dp,i,j-2));
        return dp[i][j]=Math.max(front,back);
    }
    
}
// 17/2=8