class Solution {
    public int rob(int[] nums) {
        int memo[]=new int[nums.length+1];
        Arrays.fill(memo,-1);
        return rober(nums,nums.length-1,memo);
    }
    int rober(int arr[],int len,int memo[]){
        if(len<0) return 0;
        if(memo[len]>=0){
        return memo[len];
        }
            int res=Math.max(rober(arr,len-1,memo),arr[len]+rober(arr,len-2,memo));
            memo[len]=res;
            return res; 
    }
}