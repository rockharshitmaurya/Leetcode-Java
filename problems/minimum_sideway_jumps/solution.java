class Solution {
    int dp[][];
    public int minSideJumps(int[] obstacles) {
        int m=obstacles.length; int grid[][]=new int[3][m]; int idx=0;
        dp=new int[3][m];
        for(int arr[]:dp) Arrays.fill(arr,-1);
        for(int ob:obstacles){
            if(ob!=0){
               grid[ob-1][idx]=1; 
            }
            idx++;
        }
        // System.out.println(Arrays.deepToString(grid));
      return helper(grid,1,0,3,m);
    }
    int helper(int grid[][],int i,int j,int n,int m){
        if(i<0 ||  i>n-1 || grid[i][j]==1) return (int)1e9;
        if(j==m-1){
             // System.out.println(i+" "+j);
            return 0;
        } 
        // System.out.println(i+" "+j);
        if(dp[i][j]!=-1) return dp[i][j];
        // grid[i][j]=1;
        if(grid[i][j+1]!=1){
            dp[i][j]=helper(grid,i,j+1,n,m);
        }else{
            int up=1+Math.min(helper(grid,i-1,j,n,m),helper(grid,i-2,j,n,m));
            int down=1+Math.min(helper(grid,i+1,j,n,m),helper(grid,i+2,j,n,m));
            dp[i][j]=Math.min(up,down);
        }
        // grid[i][j]=0;
        return dp[i][j];
    }
}
//[0,0,2,3,2,0,0,0,1,0,2,0,3,1,3,1,2,2,0]
//[0,2,0,0,0,1,0,2,0,3,2,0]