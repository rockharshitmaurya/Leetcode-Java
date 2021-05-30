class Solution {
    public int maximumGap(int[] nums) {
      if(nums.length==1) return 0;
        int max=0;
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            max=Math.max(max,nums[i]-nums[i-1]);
        }
        return max;
    }
}