class Solution {
    public int maxProduct(int[] nums) {
       // Arrays.sort(nums);
       //  int len=nums.length;
       //  return ((nums[len-1]-1)*(nums[len-2]-1));
        int max1=0,max2=0;
        for(int a:nums){
            if(a>max1){
                max2=max1;
                max1=a;
            }else if(a>max2){
                max2=a;
            }
        }
        return (max1-1)*(max2-1);
    }
}