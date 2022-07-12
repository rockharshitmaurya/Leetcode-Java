class Solution {
    HashMap<String,Integer> map=new HashMap<>();
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        return helper(nums,n-1,target);
    }
    int helper(int nums[],int idx,int target){
        if(idx<0){
            if(target==0) return 1;
            else return 0;
        }
        String key=idx+":"+target;
        if(map.containsKey(key)) return map.get(key);
        int left=helper(nums,idx-1,target-nums[idx]);
        int mid=helper(nums,idx-1,target-(-nums[idx]));
        map.put(key,(left+mid));
        return left+mid;
    }
}