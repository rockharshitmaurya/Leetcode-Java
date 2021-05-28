class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int max=0,res=0,i=0,j=0;
        while(i<nums.length && j<nums.length){
            if(!set.contains(nums[j])){
                res+=nums[j];
                max=Math.max(max,res);
                set.add(nums[j++]);
            }else{
                res-=nums[i];
                set.remove(nums[i++]);
            }
        }
        return max;
    }
}
//2-4-4-5-6