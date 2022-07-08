class Solution {
    // int ans=0;
    public int integerBreak(int n) {
        if(n==2) return 1;
        int arr[]=new int[n-1];
        int len=arr.length;
        int dp[][]=new int[len][n+1];
        for(int i=0; i<len; i++) dp[i][0]=1;
        for(int idx=1; idx<len; idx++){
            for(int k=1; k<=n; k++){
                int left=1,right=1;
                if((idx+1)<=k) left=(idx+1)*dp[idx][k-(idx+1)];
                right=dp[idx-1][k];
                dp[idx][k]=Math.max(left,right);
            }
        }
        return dp[n-2][n];
    }
}