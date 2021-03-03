class Solution {
    public int maxSubArray(int[] nums) {
     int max=Integer.MIN_VALUE,sum=0;
        for(int i:nums){
            if(sum<0){
                sum=i;
            }else{
                sum+=i;
            }
             if(max<sum){
                max=sum;
            }
            
        }
       return max;
    }
}