class Solution {
    public void sortColors(int[] nums) {
        int left=0,right=nums.length-1,idx=0;
        while(idx<=right && left<=right){
            if(nums[idx]==0){
                swap(nums,idx,left);
                idx++;
                left++;
            }else if(nums[idx]==2){
                swap(nums,idx,right);
                right--;
            }else{
                idx++;
            }            
    }
    }
    void swap(int arr[],int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
}