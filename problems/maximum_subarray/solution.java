class Solution {
    public int maxSubArray(int[] nums) {
        int ans=Integer.MIN_VALUE,temp=0;
        
        for(int num:nums){
            if(temp<0){
                temp=num;
            }else{
                temp+=num;
            }
            ans=Math.max(ans,temp);
        }
        return ans;
    }
}