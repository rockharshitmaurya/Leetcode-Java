class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> set=new HashMap<Integer,Integer>();
        int ar[]=new int[2];
        for(int i=0; i<nums.length; i++){
            int num=target-nums[i];
            if(set.containsKey(num)){
                ar[0]=i;
                ar[1]=set.get(num);
                return ar;
            }
            set.put(nums[i],i);
        }
         return ar;
    }
}