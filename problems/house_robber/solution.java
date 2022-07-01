class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        dp[0]=nums[0];
        for(int i=1; i<n; i++){
            int take=nums[i]+((i>1)?dp[i-2]:0); //take the current value and add the non adjcent(-2) index value to cuurent path
            int nottake=0+dp[i-1]; //do not add the current index just add prev dp calculated value
            dp[i]=Math.max(take,nottake);
        }
        return dp[n-1];
    }
}