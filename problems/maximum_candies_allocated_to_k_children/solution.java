class Solution {
    public int maximumCandies(int[] candies, long k) {
        int low=1;
        int high=0;
        for(int num:candies){
            high=Math.max(high,num);
        }
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(helper(candies,mid,k)){
                low=mid+1;
                ans=mid;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    boolean helper(int arr[],int ans,long k){
        long count=0;
        for(int num:arr){
            count+=(num/ans);
        }
        // System.out.println(count+" "+ans);
        return count>=k;
    }
}