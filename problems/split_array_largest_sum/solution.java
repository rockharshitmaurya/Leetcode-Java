class Solution {
    public int splitArray(int[] nums, int m) {
     int left=0,right=0;
        for(int num:nums){
            left=Math.max(left,num);
            right+=num;
        }
        int ans=right;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(getNoOfSubArray(nums,mid,m)==false){
                left=mid+1;
            }else{
                ans=mid;
                right=mid-1;
            }
        }
        return ans;
    }
    boolean getNoOfSubArray(int arr[],int limit,int subarr){
        int ans=0,count=1;
        for(int num:arr){
            if(num>limit) return false;
            if(ans+num>limit){
                count++;
                ans=num;
            }else{
                ans+=num;
            }
            
        }
        return count<=subarr;
    }
}