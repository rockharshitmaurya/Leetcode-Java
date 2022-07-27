class Solution {
    public int minPathCost(int[][] grid, int[][] moveCost) {
        int m=grid.length,n=grid[0].length;
        int dp[][]=new int[m][n];
        // for(int sub[]:dp) 
        //     Arrays.fill(sub,(int)1e9);
        
        for(int i=0; i<n; i++) 
            dp[m-1][i]=grid[m-1][i];
        
        for(int i=m-2; i>=0; i--){
            for(int j=0; j<n; j++){
                    int val=(int)1e9;
                    for(int next=0; next<grid[0].length; next++){
                        int node_sum=grid[i][j];
                        int path_sum=moveCost[node_sum][next];
                        val=Math.min(val,node_sum+path_sum+dp[i+1][next]);
                    }
                dp[i][j]=val;
            }
        }
        for(int i=0; i<n; i++) 
            dp[0][0]=Math.min(dp[0][0],dp[0][i]);
        return dp[0][0];
    }
    int helper(int[][] grid, int[][] moveCost,int i,int j,int dp[][]){
        if(i==grid.length-1) return grid[i][j];
            if(dp[i][j]!=-1) return dp[i][j];
            int val=(int)1e9;
            for(int next=0; next<grid[0].length; next++){
                int node_sum=grid[i][j];
                int path_sum=moveCost[node_sum][next];
                val=Math.min(val,node_sum+path_sum+helper(grid,moveCost,i+1,next,dp));
            }
        return dp[i][j]=val;
    }
}