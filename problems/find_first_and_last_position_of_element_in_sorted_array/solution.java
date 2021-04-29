class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[]={-1,-1};
        boolean start=false,end=false;
        int len=nums.length;
        for(int i=0; i<len; i++){
            if(nums[i]==target && start==false){
                res[0]=i;
                start=true;
            }
           if(nums[len-i-1]==target && end==false){
               res[1]=len-i-1;
               end=true;
           }
            if(start==true && end==true) break;
        }
        return res;
    }
}