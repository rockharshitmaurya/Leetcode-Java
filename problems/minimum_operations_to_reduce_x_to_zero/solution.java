class Solution {
    public int minOperations(int[] nums, int x) {
        long sum=0;
        for(int num:nums) sum+=num;
        if(sum<x) return -1;
        sum-=x;
        int i=0,j=0,temp=0,ans=-1;
        while(i<nums.length && j<nums.length){
            
            if(temp<sum){
                temp+=nums[j++];
            }
            if(temp>sum){
                while(i<=j && temp>sum){
                    temp-=nums[i];
                    i++;
                }
            }
            if(temp==sum){
               ans=Math.max(ans,j-i+1);
               temp-=nums[i];
               i++; 
            }
            // System.out.println(temp+" "+sum);
        }
        if(temp==sum)ans=Math.max(ans,j-i+1);
        return ans==-1?-1:(nums.length-ans)+1;
    }
}