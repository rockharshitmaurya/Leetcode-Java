class Solution {
    public int minDeletion(int[] nums) {
       int ans=0;
        for(int i=0; i<nums.length-1; i++){
            if((i-ans)%2==0 && nums[i]==nums[i+1]) ans++;
        }
        return ans+(nums.length-ans)%2;
    }
}