class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left=1,right=0;
        for(int num:nums) right=Math.max(right,num);
        int ans=right;
        while(left<=right){
            int temp=0;
            int mid=left+(right-left)/2;
            for(int num:nums){
                temp+=(num/mid);
                if(num%mid!=0) temp++;
            }
            if(temp<=threshold){
                right=mid-1;
                ans=mid;
            }else{
                left=mid+1;
            }
            // System.out.println(temp+" "+mid);
        }
      return ans;  
    }
}