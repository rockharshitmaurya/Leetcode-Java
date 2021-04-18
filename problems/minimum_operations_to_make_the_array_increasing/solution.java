class Solution {
    public int minOperations(int[] nums) {
        int res=0; //1-1-1
        for(int i=1; i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                int toadd=(nums[i-1]-nums[i])+1;
                nums[i]+=toadd;
                res+=toadd;
            }
        }
        return res;
    }
}