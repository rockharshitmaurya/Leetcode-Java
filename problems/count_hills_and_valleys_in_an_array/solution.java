class Solution {
    public int countHillValley(int[] nums) {
//         LinkedHashSet<Integer> set=new LinkedHashSet<>();
//         for(int i=0; i<nums.length; i++){
//             set.add(nums[i]);
        
//         }
//         System.out.println(set);
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=nums[i-1]) list.add(nums[i]);
        }
        list.add(0,nums[0]);
        int ans=0;
        for(int i=1; i<list.size()-1; i++){
            if(list.get(i)>list.get(i-1) && list.get(i)>list.get(i+1) || 
               list.get(i)<list.get(i-1) && list.get(i)<list.get(i+1) ) ans++;
        }
        return ans;
    }
}