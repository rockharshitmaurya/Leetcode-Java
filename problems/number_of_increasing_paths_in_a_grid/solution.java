class Solution {
    int mod=(int)1e9+7;
    int dir[][]={{0,1},{1,0},{0,-1},{-1,0}};
    int memo[][];
    public int countPaths(int[][] grid) {
        memo=new int[grid.length][grid[0].length];
        for(int arr[]:memo) Arrays.fill(arr,-1);
        int m=grid.length,n=grid[0].length;
        int ans=0;
        for(int i=0; i<grid.length; i++)
            for(int j=0; j<grid[0].length; j++)
                ans=(ans+helper(grid,i,j))%mod;
        // System.out.println(Arrays.deepToString(memo));
        return ans;
    }
    int helper(int[][] grid,int row,int col){
        long res=1;
        if(memo[row][col]!=-1) return memo[row][col];
        for(int xy[]:dir){
            int n_row=xy[0]+row;
            int n_col=xy[1]+col;
            if(n_row<0 || n_col<0 || n_row==grid.length || n_col==grid[0].length || grid[n_row][n_col]<=grid[row][col]) continue;
            res=(res+helper(grid,n_row,n_col))%mod;
        }
        return memo[row][col]=(int)res;
    }
}