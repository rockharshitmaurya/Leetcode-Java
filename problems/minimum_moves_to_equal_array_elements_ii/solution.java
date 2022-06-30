class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        for(int i=0; i*2<nums.length; i++){
            ans+=(nums[nums.length-i-1]-nums[i]);
        }
      return ans;  
    }
}