class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums) map.put(num,1);
        int count=0,ans=0;
        for(int num:nums){
            int find=num;
            if(map.containsKey(find-1)) continue;
            while(map.containsKey(find)){
                count++; find++;
            }
            ans=Math.max(ans,count); count=0;
        }
        return ans;
    }
}