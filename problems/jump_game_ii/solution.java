class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,(int)1e8);
        dp[n-1]=0;
        
        for(int idx=n-2; idx>=0; idx--){
            int jump=(int)1e8; 
            if(nums[idx]==0) continue;
            for(int i=idx+1; i<=Math.min((idx+nums[idx]),n-1); i++)
                jump=Math.min(jump,1+dp[i]);
            dp[idx]=jump;
        }
        
        return dp[0];
    }
    
    int helper(int nums[],int idx){
        if(idx==nums.length-1) return 0;
        if(idx>=nums.length) return (int)1e8;
        if(nums[idx]==0) return (int)1e8;
        int jump=(int)1e8;
        
        for(int i=idx+1; i<=(idx+nums[idx]); i++)
            jump=Math.min(jump,1+helper(nums,i));
        return jump;
    }
}