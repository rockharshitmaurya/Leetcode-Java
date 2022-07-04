class Solution {
    public int cherryPickup(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        int dp[][][]=new int[n][m][m];
        for(int dj1=0; dj1<m; dj1++){
            for(int dj2=0; dj2<m; dj2++){
                if(dj1==dj2) dp[n-1][dj1][dj2]=grid[n-1][dj1];
                else dp[n-1][dj1][dj2]=grid[n-1][dj1]+grid[n-1][dj2];
            }
        }
        for(int i=n-2; i>=0; i--){
            for(int col1=0; col1<m; col1++){
                for(int col2=0; col2<m; col2++){
                    int max=(int)-1e8;
                    for(int dj1=-1; dj1<=1; dj1++){
                        for(int dj2=-1; dj2<=1; dj2++){
                        int val=0;
                        if(col1==col2) val=grid[i][col1];
                        else val=grid[i][col1]+grid[i][col2];
                        if(col1+dj1>=0 && col1+dj1<m && col2+dj2>=0 && col2+dj2<m)
                            val+=dp[i+1][col1+dj1][col2+dj2];
                        else val+=(int)-1e8;
                        max=Math.max(max,val);
                        }
                    }
                    dp[i][col1][col2]=max;
                }
            }
        }
       return dp[0][0][m-1]; 
    }
    int helper(int grid[][],int row,int col1,int col2,int len,int dp[][][]){
        if(col1<0 || col2<0 || col1>=len || col2>=len) return (int)-1e8;
        if(row==grid.length-1){
                if(col1==col2) return grid[row][col1];
                else return grid[row][col1]+grid[row][col2];
        }
        if(dp[row][col1][col2]!=-1) return dp[row][col1][col2];
        int min=(int)-1e8;
        for(int dj1=-1; dj1<=1; dj1++){
            for(int dj2=-1; dj2<=1; dj2++){
                int val=0;
                if(col1==col2) val=grid[row][col1];
                else val=grid[row][col1]+grid[row][col2];
                val+=helper(grid,row+1,col1+dj1,col2+dj2,len,dp);
                min=Math.max(min,val);
            }
        }
        return dp[row][col1][col2]=min;
    }
}