class Solution {
    public int uniquePathsWithObstacles(int[][] og) {
        int m=og.length,n=og[0].length;
        int memo[][]=new int[m][n];
        for(int arr[]:memo)
            Arrays.fill(arr,-1);
        return helper(og,m-1,n-1,memo);
    }
     int helper(int grid[][],int row,int col,int memo[][]){
        if(row==0 && col==0){
            if(grid[0][0]==1) return 0;
            else return 1;
        }
        if(row<0 || col<0 || grid[row][col]==1) return 0;
        if(memo[row][col]!=-1) return memo[row][col];
        int l=helper(grid,row-1,col,memo);
        int r=helper(grid,row,col-1,memo);
        memo[row][col]=l+r;
        return l+r;
    }
}