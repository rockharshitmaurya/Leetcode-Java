class Solution {
    public List<List<String>> displayTable(List<List<String>> orders) {
        HashMap<String,HashMap<String,Integer>> map=new HashMap<>();
        SortedSet<String> foodname=new TreeSet<>();
        SortedSet<Integer> table_no=new TreeSet<>();
        for(List<String> list:orders){
            table_no.add(Integer.parseInt(list.get(1)));
            foodname.add(list.get(2));
            if(!map.containsKey(list.get(1))){
                map.put(list.get(1),new HashMap<>());
            }
            HashMap<String,Integer> h_map=map.get(list.get(1));
            h_map.put(list.get(2),h_map.getOrDefault(list.get(2),0)+1);
        }
        List<List<String>> ans=new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.get(0).add("Table");
        HashMap<String,Integer> index=new HashMap<>();
        int i=1;
        for(String dish:foodname){
            ans.get(0).add(dish);
            index.put(dish,i++);
        } 
        int idx=1;
        for(Integer no:table_no){
            String tb_no=String.valueOf(no);
            // System.out.println(tb_no);
            ans.add(new ArrayList<>(Collections.nCopies(ans.get(0).size(), "0")));
            ans.get(idx).set(0,tb_no);
            
            for(Map.Entry<String,Integer> mp:map.get(tb_no).entrySet()){
                String food=mp.getKey();
                int getCount=mp.getValue();
                ans.get(idx).set(index.get(food),getCount+"");
                
            }
            idx++;
            
        }
//         ArrayList<String> toadd=new ArrayList<>();
        
        return ans;
    }
}