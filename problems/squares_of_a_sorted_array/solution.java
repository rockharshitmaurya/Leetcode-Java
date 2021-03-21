class Solution {
    public int[] sortedSquares(int[] nums) {
        int len=nums.length;
        int arr[]=new int[len];
        int s=0,e=len-1;
        for(int i=len-1; i>=0; i--){
            if(Math.abs(nums[s])>Math.abs(nums[e])){
                arr[i]=nums[s]*nums[s];
                s++;
            }else{
                arr[i]=nums[e]*nums[e];
                e--;
            }
        }
        
        return arr;
    }
}