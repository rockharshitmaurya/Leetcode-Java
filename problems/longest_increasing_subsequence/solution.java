class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,1); int ans=0;
        for(int i=0; i<nums.length; i++){
            int mx=0;
            for(int j=i-1; j>=0; j--){
                if(nums[j]<nums[i]){
                    // dp[i]+=dp[j];
                    mx=Math.max(mx,dp[j]);
                    // break;
                }
            }
            dp[i]+=mx;
            ans=Math.max(ans,dp[i]);
        }
        return ans;
    }
}