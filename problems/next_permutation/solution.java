class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length-1;
        int start=-1,end=n;
        for(int i=n; i>0; i--){
            if(nums[i-1]<nums[i]){
                start=i-1;
                break;
            }
        }
        if(start==-1){
           reverse(nums,0,n);
            return;
        }
        for(int i=n; i>=1; i--){
            if(nums[i]>nums[start]){
               end=i;
               break;
            }
        }
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        reverse(nums,start+1,n);
    }
    public static void reverse(int[] arr, int l, int r) {
		int d = (r - l + 1) / 2;
		for (int i = 0; i < d; i++) {
			int t = arr[l + i];
			arr[l + i] = arr[r - i];
			arr[r - i] = t;
		}
	}
}