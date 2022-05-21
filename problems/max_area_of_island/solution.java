class Solution {
    public int maxAreaOfIsland(int[][] grid) {
       int n=grid.length,m=grid[0].length;
       // boolean visited[][]=new boolean[n][m];
       int ans=0;
       for(int i=0; i<n; i++){
           for(int j=0; j<m; j++){
               if(grid[i][j]==1){
                   int count=dfs(grid,i,j,n,m);
                   ans=Math.max(ans,count);
               }
           }
       }
        return ans;
    }
    int dfs(int[][] grid,int i,int j,int n,int m){
        if(!(i<0 || i>=n || j<0 || j>=m || grid[i][j]==0)){
           grid[i][j]=0;
           // ans++;
           return 1+dfs(grid,i,j+1,n,m)+ 
           dfs(grid,i,j-1,n,m) 
           +dfs(grid,i+1,j,n,m) 
           +dfs(grid,i-1,j,n,m); 
        }
        return 0;
    }
}