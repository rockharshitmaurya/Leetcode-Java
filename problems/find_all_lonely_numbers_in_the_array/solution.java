class Solution {
    public List<Integer> findLonely(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> ar=new ArrayList<>();
        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        // System.out.println(map);
        for(int i:nums){
            if(map.get(i-1)==null && map.get(i+1)==null && map.get(i)==1) ar.add(i);
        }
        return ar;
    }
}