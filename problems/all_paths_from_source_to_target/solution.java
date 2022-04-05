class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> help=new ArrayList<>();
        help.add(0);
        dfs(graph,ans,help,0);
        
        return ans;
    }
    void dfs(int[][] graph,List<List<Integer>>  ans,List<Integer> help,int start){
        if(start==graph.length-1){
            ans.add(new ArrayList<>(help));
            return;
        }
        for(int i:graph[start]){
            help.add(i);
            dfs(graph,ans,help,i);
            help.remove(help.size()-1);
        }

    }
}