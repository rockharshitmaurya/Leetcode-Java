class Solution {
    public int[] getConcatenation(int[] nums) {
        int len=(nums.length*2);
        int ans[]=new int[len];
        for(int i=0; i<nums.length; i++){
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }
        return ans;
        
    }
}