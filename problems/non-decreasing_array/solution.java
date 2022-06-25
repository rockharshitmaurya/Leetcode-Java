class Solution {
    public boolean checkPossibility(int[] nums) {
        for(int i=0; i<nums.length-1; i++){
            // System.out.println(nums[i]+" "+nums[i+1]);
            if(nums[i]>nums[i+1]){
                if(i+2==nums.length) nums[i+1]=nums[i];
                else if(nums[i+2]>=nums[i]){
                    nums[i+1]=nums[i];
                }else{
                    nums[i]=nums[i+1];
                }
                            break;
            }
        }
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]>nums[i+1]) return false;
        }
     return true;   
    }
}