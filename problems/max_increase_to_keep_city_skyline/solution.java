class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
       int len=grid.length;
        int row[]=new int[len],col[]=new int[len];
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                row[i]=Math.max(row[i],grid[i][j]);
                col[j]=Math.max(col[j],grid[i][j]);
            }
        }
        // System.out.println(Arrays.toString(row));
        //  System.out.println(Arrays.toString(col));
        int res=0;
         for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                res+=Math.min(row[i],col[j])-grid[i][j];
            }
        }
        return res;
    }
}