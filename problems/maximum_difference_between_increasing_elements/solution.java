class Solution {
    public int maximumDifference(int[] nums) {
        int len=nums.length;
        int arr[]=new int[len];
        arr[len-1]=len-1;
        for(int i=len-2; i>=0;i--){
            if(nums[i]>nums[arr[i+1]]){
                arr[i]=i;
            }else{
                arr[i]=arr[i+1];
            }
        }
        int max=0;
        for(int i=0; i<len; i++){
            max=Math.max(max,(nums[arr[i]]-nums[i]));
        }
        // System.out.println(Arrays.toString(arr));
        return max==0?-1:max;
    }
}