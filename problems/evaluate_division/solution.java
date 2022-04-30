class Solution {
    public double[] calcEquation(List<List<String>> eq, double[] val, List<List<String>> qu) {
        Map<String,Map<String,Double>> map=new HashMap<>();
        for(int i=0; i<eq.size(); i++){
            map.putIfAbsent(eq.get(i).get(0),new HashMap<String,Double>());
            map.putIfAbsent(eq.get(i).get(1),new HashMap<String,Double>());
            map.get(eq.get(i).get(0)).put(eq.get(i).get(1),val[i]);
            map.get(eq.get(i).get(1)).put(eq.get(i).get(0),1/val[i]);
        }
        double[] ans=new double[qu.size()];
        for(int i=0; i<qu.size(); i++){
           ans[i]=dfs(qu.get(i).get(0),qu.get(i).get(1),1,map,new HashSet<>()); 
        }
       return ans; 
    }
    double dfs(String s, String t, double r, Map<String, Map<String, Double>> map, Set<String> seen) {
        if(!map.containsKey(s) || !seen.add(s)) return -1;
        if(s.equals(t)) return r;
        Map<String, Double> next=map.get(s);
        for(String c:next.keySet()){
            double ans=dfs(c,t,r*next.get(c),map,seen);
            if(ans!=-1) return ans;
        }
        return -1;
    }
    
}