class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for(int num:nums){
            int find=k-num;
            if(map.containsKey(find)){
                if(map.get(find)==1) map.remove(find);
                else map.put(find,map.get(find)-1);
                ans++;
            }else{
                if(num<k) map.put(num,map.getOrDefault(num,0)+1);
            }
        }
        return ans;
    }
}