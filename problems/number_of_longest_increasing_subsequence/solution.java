class Solution {
    public int findNumberOfLIS(int[] arr) {
        int n=arr.length,cout=0,max=0;
        int dp[]=new int[n];
        int count[]=new int[n];
        for(int i=0; i<n; i++){
            dp[i]=1; count[i]=1;
            for(int j=i-1; j>=0; j--){
                if(arr[j]<arr[i] && 1+dp[j]>dp[i]){
                    dp[i]=dp[j]+1;
                    count[i]=count[j];
                }else if(arr[j]<arr[i] && 1+dp[j]==dp[i]){
                    count[i]+=count[j];
                }
            }
            max=Math.max(max,dp[i]);
        }
        for(int i=0; i<n; i++){
            if(dp[i]==max) cout+=count[i];
        }
        // System.out.println(Arrays.toString(dp));
        return cout;
    }
}