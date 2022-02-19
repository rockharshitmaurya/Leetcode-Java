class Solution {
    public int countPairs(int[] nums, int k) {
       int len=nums.length,count=0;
        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                if(nums[i]==nums[j]){
                    if(((i*j)%k)==0) count++;
                }
            }
        }
        return count;
    }
}