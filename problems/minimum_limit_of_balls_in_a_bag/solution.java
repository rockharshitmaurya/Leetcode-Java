class Solution {
    public int minimumSize(int[] nums, int maxOp) {
     int left=1,right=(int)1e9;
    // for(int num:nums) right=Arrays.stream(nums).max().getAsInt();
    int ans=right;
        while(left<=right){
            int mid=left+(right-left)/2;
            int count=0;
            for(int num:nums){
                count+=(num-1)/mid;
            }
            if(count<=maxOp){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
            
        }
        return ans;
    }
}