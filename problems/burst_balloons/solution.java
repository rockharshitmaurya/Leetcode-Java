class Solution {
    public int maxCoins(int[] nums) {
        int n=nums.length;
        nums=convert(nums);
        // System.out.println(Arrays.toString(nums));
        int dp[][]=new int[n+2][n+2];
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n; j++){
                if(i>j) continue;
                int max=Integer.MIN_VALUE;
                
                for(int idx=i; idx<=j; idx++){
                    int step=nums[i-1]*nums[idx]*nums[j+1]+dp[i][idx-1]+dp[idx+1][j];
                    max=Math.max(step,max);
                }
                dp[i][j]=max;
            }
        }
        return dp[1][n];
    }
    int[] convert(int nums[]){
        int arr[]=new int[nums.length+2];
        for(int i=0; i<nums.length; i++){
            arr[i+1]=nums[i];
        }
        arr[0]=1;
        arr[arr.length-1]=1;
        return arr;
    }
}