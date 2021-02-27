class Solution {
    public int numIdenticalPairs(int[] nums) {
     int count=0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> en:map.entrySet()){
            if(en.getValue()>1){
                count+=(en.getValue()-1)*(en.getValue())/2;
            }
        }
        return count;
    }
}