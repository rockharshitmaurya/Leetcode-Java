class Solution {
    public boolean makesquare(int[] arr) {
        long sum=0;
        for(int num:arr) sum+=num;
        if(sum%4!=0) return false;
        // Arrays.sort(arr);
        // reverse(arr);
        return helper(arr,((int)sum/4),0,new int[4]);
    }
    boolean helper(int arr[],int target,int idx,int sum[]){
        if(idx==arr.length){
            return true;
        }
            for(int i=0; i<4; i++){
                if(sum[i]+arr[idx]>target || (i > 0 && sum[i] == sum[i - 1])) continue;
                sum[i]+=arr[idx];
                if(helper(arr,target,idx+1,sum)) return true;
                sum[i]-=arr[idx];
            }
        return false;
    }
    private void reverse(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++; j--;
        }
    }
}