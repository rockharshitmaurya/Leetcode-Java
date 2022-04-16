class Solution {
    public int findClosestNumber(int[] nums) {
        Arrays.sort(nums);
        int ans=Integer.MAX_VALUE;
        int res=0;
        for(int i=0; i<nums.length; i++){
            int a=nums[i];
            int set=Math.abs(a-0);
            if(set<=ans){
              ans=set;
                res=nums[i];
            }
            
        }
        return res;
    }
}