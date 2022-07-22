class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        int size=0;
        for(int i=0; i<n; i++){
            int idx=Arrays.binarySearch(dp,0,size,nums[i]);
            if(idx < 0) idx = -(idx + 1);
            dp[idx]=nums[i];
            if(idx==size) size++;
        }
        return size;
    }
}