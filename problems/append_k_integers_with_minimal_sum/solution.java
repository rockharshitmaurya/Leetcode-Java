class Solution {
    public long minimalKSum(int[] nums, int k) {
        long sum=(long)k * ((long)k + 1) /2,last=k+1;
        Arrays.sort(nums);
       // Set<T> set = new HashSet<>(Arrays.asList(nums));
        for(int i=0; i<nums.length; i++){
            if (i - 1 >= 0 && nums[i] == nums[i - 1]) continue;
            if(nums[i]<last){
                sum+=last++ - nums[i];
            }else break;
        }
        return sum;
    }
}