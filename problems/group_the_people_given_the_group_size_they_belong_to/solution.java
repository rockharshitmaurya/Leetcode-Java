class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> list=new ArrayList<>();
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0; i<groupSizes.length; i++){
            List<Integer> temp=new ArrayList<>();
            int key=groupSizes[i];
            if(map.containsKey(key)) temp=map.get(key);
            temp.add(i);
            map.put(key,temp);
            if(temp.size()==key){
                list.add(temp);
                map.remove(key);
            }
        }
        return list;
    }
}
// 2,1,3,3,3,2
