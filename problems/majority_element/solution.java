class Solution {
    public int majorityElement(int[] nums) {
      int count=1;
        int majelement=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[majelement]){
                count++;
            }else{
                count--;
            }
            if(count==0){
                majelement=i;
                count=1;
            }
        }
        return nums[majelement];
        // int value=0;
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     if(count==0){
        //         value=nums[i];
        //     }
        //     if(value==nums[i]){
        //         count++;
        //     }else{
        //         count--;
        //     }
        // }
        // return value;
    }
}