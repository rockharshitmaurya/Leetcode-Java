class Solution {
    public int minimumTotal(List<List<Integer>> tngl) {
        for(int i=tngl.size()-2; i>=0; i--){
            for(int j=0; j<tngl.get(i).size(); j++){
                int down=tngl.get(i+1).get(j);
                // System.out.println(i+" "+j+" "+tngl.get(i));
                int dig=tngl.get(i+1).get(j+1);
                int cur=tngl.get(i).get(j);
                tngl.get(i).set(j,Math.min(down,dig)+cur);
                
            }
        }
        return tngl.get(0).get(0);
    }
}