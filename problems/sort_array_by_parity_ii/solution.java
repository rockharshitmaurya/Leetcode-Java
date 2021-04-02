class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int len=nums.length;
        int arr[]=new int[len];
        int even=0,odd=1;
        for(int num:nums){
            if(num%2==0) {
                arr[even]=num;
                even+=2;
            }else{
                arr[odd]=num;
                odd+=2;
            }
        }
        return arr;
    }
}