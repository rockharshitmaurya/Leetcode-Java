class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans=0;
        long s_len=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                s_len++;
            }else{
                ans+= s_len * (s_len+1) / 2;
                
                s_len=0;
            }
        }
        if(s_len>0){
           ans+= s_len * (s_len+1) / 2; 
        }
        return ans;
    }
}