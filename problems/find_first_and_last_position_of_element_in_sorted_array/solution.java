class Solution {
    int start=-1,end=-1;
    public int[] searchRange(int[] nums, int target) {
        int idx=binarySearch_left(nums,target,0,nums.length-1,-1);
        int idx2=binarySearch_right(nums,target,0,nums.length-1,-1);
       return new int[]{idx,idx2}; 
    }
    int binarySearch_left(int nums[],int target,int l,int r,int idx){
        if(l<=r){
            int mid=(l+r)>>1;
            if(nums[mid]==target) idx=mid;
            
            if(nums[mid]<target) return binarySearch_left(nums,target,mid+1,r,idx);
            
            return binarySearch_left(nums,target,l,mid-1,idx);
        }
        return idx;
    }
    
    int binarySearch_right(int nums[],int target,int l,int r,int idx){
        if(l<=r){
            int mid=(l+r)>>1;
            if(nums[mid]==target) idx=mid;
            
            if(nums[mid]<=target) return binarySearch_right(nums,target,mid+1,r,idx);
            
            return binarySearch_right(nums,target,l,mid-1,idx);
        }
        return idx;
    }
}