class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum=0;
        for(int num:nums) sum+=num;
        int count=0;
        long t_sum=0;
        for(int i=0; i<nums.length-1; i++){
            t_sum+=nums[i];
            if(t_sum>=(sum-t_sum)) count++;
        }
        return count;
    }
}