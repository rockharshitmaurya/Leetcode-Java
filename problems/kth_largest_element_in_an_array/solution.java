class Solution {
    public int findKthLargest(int[] nums, int k) {
        shuffle(nums);
        return quickSelect(nums,0,nums.length-1,nums.length-k);
    }
    int quickSelect(int nums[],int start,int end,int k){
        int pivot=nums[end];
        int left=start;
        for(int i=start; i<end; i++){
            if(nums[i]<=pivot){
                swap(nums,i,left++);
            }
        }
        swap(nums,left,end);
        if(left==k) return nums[k];
        else if(left<k) return quickSelect(nums,left+1,end,k);
        else return quickSelect(nums,start,left-1,k);
    }
    void shuffle(int nums[]){
        Random rnd=new Random();
        for(int i=0; i<nums.length; i++){
            int idx=rnd.nextInt(i+1);
            swap(nums,i,idx);
        }
    }
    void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}