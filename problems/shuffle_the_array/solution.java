class Solution {
    public int[] shuffle(int[] nums, int n) {
      int[] arr=new int[n*2];
     for(int i=0; i<nums.length; i++){
         arr[i]= ((i&1)==0)?nums[i/2]:nums[n+i/2];
     }
        return arr;
    }
}