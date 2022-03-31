class Solution {
    public int splitArray(int[] nums, int m) {
      
        int low=0,high=0;
        for(int num:nums){
           low=Math.max(low,num);
           high+=num;
        }
        int ans=high;
        while(low<=high){
            int mid=(low+high)/2;
            if(findSubArray(nums,mid,m)==false){
                low=mid+1;
            }else{
                ans=mid;
                high=mid-1;
            }
            
        }
        return ans;
    }
    boolean findSubArray(int arr[],int mid,int m){
        int count=1;
        int sum=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>mid) return false;
            if(sum+arr[i]>mid){
                sum=arr[i];
                count++;
            }else{
                sum+=arr[i];
            }
        }
        return count<=m;
    }
}