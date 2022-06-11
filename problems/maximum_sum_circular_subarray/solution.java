class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totle=0,noncir=kadens(nums);
        for(int i=0; i<nums.length; i++){
            totle+=nums[i];
            nums[i]=-nums[i];
        }
        int cir=totle+kadens(nums);
        if(cir==0) return noncir;
        return Math.max(cir,noncir);
    }
    int kadens(int[] A){
        int currentSum = A[0];
        int maxSum = A[0];
        for(int i=1;i<A.length;i++){
            if(currentSum < 0)
                currentSum = 0;
            currentSum = A[i] + currentSum;
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
}