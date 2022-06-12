class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int prefix[]=new int[nums.length];
        Map<Integer,Integer> map=new HashMap<>();
        int pre=0,idx=-1,max=0;
        for(int i=0; i<nums.length; i++){
            prefix[i]=pre+nums[i];
            pre+=nums[i];
            if(map.containsKey(nums[i])){
                int num=map.get(nums[i]); 
                idx=num<idx?idx:num;
            }
            if(idx==-1) max=prefix[i];
            else max=Math.max(max,prefix[i]-prefix[idx]);
            map.put(nums[i],i);
        }
        return max;
    }
}