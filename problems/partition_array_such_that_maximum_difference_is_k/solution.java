class Solution {
    public int partitionArray(int[] nums, int k) {
     Arrays.sort(nums);
        int start=nums[0];
        int ans=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]-start>k){
                ans++;
                start=nums[i];
            }
        }
      return ans+1;  
    }
}