class Solution {
    public int missingNumber(int[] nums) {
        int sum=0,max=nums.length;
        for(int i:nums) sum+=i;
        return ((max*(max+1))/2)-sum;
    }
}