class Solution {
    public boolean isBipartite(int[][] graph) {
      int color[]=new int[graph.length];
      for(int i=0; i<graph.length; i++){
              if(color[i]==0){
              Queue<Integer> q=new LinkedList<>();
              q.offer(i);
              color[i]=1;
              while(!q.isEmpty()){
                  Integer node=q.poll();
                  for(int n:graph[node]){
                     if(color[n]==color[node]) return false;
                      else if(color[n]==0){
                        q.offer(n);
                        color[n]=color[node]*-1;
                      }
                  }
              }
          }
      }
        return true;
    }
    // private boolean isValid(int[][] graph,int color[],int c,int node){
    //     System.out.print(c+" ");
    //     if(color[node]!=0)
    //         return color[node]==c;
    //     color[node]=c;
    //     for(int n:graph[node]){
    //         if(!isValid(graph,color,-c,n)) return false;
    //     }
    //     return true;    
    // }
}