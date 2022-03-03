class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int ans[]=new int[nums.length];
        int count=0,ptr=0;
        for(int num:nums){
            if(num<pivot){
                ans[ptr++]=num;
            }else if(num==pivot) count++;
        }
        while(count>0){
            ans[ptr++]=pivot;
            count--;
        }
        for(int num:nums){
            if(num>pivot){
                ans[ptr++]=num;
            }
        }
        return ans;
    }
}