class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int dp[]=new int[nums.length];
        int hash[]=new int[nums.length];
        Arrays.fill(dp,1); int ans=0;
        List<Integer> answer=new ArrayList<Integer>();
        int last_idx=0;
        for(int i=0; i<nums.length; i++){
            hash[i]=i;
            for(int j=i-1; j>=0; j--){
                if(nums[i]%nums[j]==0 && 1+dp[j]>dp[i]){
                    dp[i]=1+dp[j];
                    hash[i]=j;
                }
            }
            if(dp[i]>ans){
                ans=dp[i];
                last_idx=i;
            }
        }

        while(hash[last_idx]!=last_idx){
            answer.add(0,nums[last_idx]);

            last_idx=hash[last_idx];
        }
        answer.add(0,nums[last_idx]);

        return answer;
    }
}