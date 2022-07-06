class Solution {
    public boolean canPartition(int[] arr) {
       long sum=0;
        for(int num:arr){
            sum+=num;
        }
        if(sum%2==1) return false;
        int k=(int)sum/2;
        int n=arr.length;
        boolean dp[][]=new boolean[n][k+1];
        for(int i=0; i<n; i++) dp[i][0]=true;
        if(arr[0]<=k) dp[0][arr[0]]=true;
        for(int i=1; i<n; i++){
            for(int target=1; target<=k; target++){
                boolean notTake=dp[i-1][target];
                boolean take=false;
                if(arr[i]<=target) take=dp[i-1][target-arr[i]];
                dp[i][target]=take||notTake;
            }
        }
        return dp[n-1][k];
    }
}