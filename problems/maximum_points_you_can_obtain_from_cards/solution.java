class Solution {
    public int maxScore(int[] arr, int k) {
        int sum=0,ans=0;
        for(int i=0; i<k; i++) sum+=arr[i];
        ans=sum; k--;
        for(int i=arr.length-1; k>=0; i--,k--){
            sum-=arr[k];
            sum+=arr[i];
            ans=Math.max(sum,ans);
        }
        return ans;
    }
}
