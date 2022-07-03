class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        for(int i=1; i<n; i++){
            for(int j=0; j<n; j++){
                int up=matrix[i-1][j];
                int right=(j+1)==n?Integer.MAX_VALUE:matrix[i-1][j+1];
                int left=(j-1)<0?Integer.MAX_VALUE:matrix[i-1][j-1];
                matrix[i][j]+=Math.min(up,Math.min(right,left));
            }
        }
        int ans=Integer.MAX_VALUE;
        // System.out.println(Arrays.deepToString(matrix));
        for(int num:matrix[n-1]) ans=Math.min(ans,num);
        return ans;
    }
}