class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n=arr.length;
        int dp[]=new int[n+1];
        for(int idx=n-1; idx>=0; idx--){
            int max=Integer.MIN_VALUE,len=0,ans=0;
                for(int i=idx; i<Math.min(arr.length,idx+k); i++){
                    // if(i==arr.length) continue;
                    len++;
                    max=Math.max(arr[i],max);
                    int step=(max*len) + dp[i+1];
                    ans=Math.max(ans,step);
                }
            dp[idx]=ans;
        }
       return dp[0];    
    }
    int helper(int arr[],int k,int idx){
        if(idx==arr.length) return 0;
        
        int max=Integer.MIN_VALUE,len=0,ans=0;
        for(int i=idx; i<Math.min(arr.length,idx+k); i++){
            len++;
            max=Math.max(arr[i],max);
            int step=(max*len) + helper(arr,k,i+1);
            ans=Math.max(ans,step);
        }
        return ans;
    }
}