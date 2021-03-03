class Solution {
    public int minTimeToVisitAllPoints(int[][] p) {
      int ans=0;
        for(int i=0; i<p.length-1; i++){
          // int cur[]=p[i],next[]=p[i+1];
          //   ans+=Math.max(Math.abs(cur[0]-next[0]),Math.abs(cur[1]-next[1]));
            ans+=Math.max(Math.abs(p[i][0]-p[i+1][0]),Math.abs(p[i][1]-p[i+1][1]));
          }
        
        return ans;
    }
}