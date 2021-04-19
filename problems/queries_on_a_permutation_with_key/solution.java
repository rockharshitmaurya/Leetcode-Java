class Solution {
    public int[] processQueries(int[] queries, int m) {
        int len=queries.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1; i<=m; i++) list.add(i);
        int res[]=new int[len];
        for(int i=0; i<len; i++){
            int num=queries[i];
        for(int j=0; j<m; j++){
            // System.out.println(i+" "+list.get(j)+" == "+num);    
            if(list.get(j)==num){
                    res[i]=j;
                    list.add(0,list.remove(j));
                    break;
                }
            }// 1-2-3-4-5-6-7-8
        }
        return res;
    }
}