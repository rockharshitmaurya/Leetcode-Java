class NumMatrix {
    int ans[][];
    public NumMatrix(int[][] matrix) {
            for(int i=0; i<matrix.length; i++){
                int runningsum=0;
                for(int j=0; j<matrix[0].length; j++){
                    runningsum+=matrix[i][j];
                    matrix[i][j]=runningsum;
                }
            }
        ans=matrix;
        System.out.println(Arrays.deepToString(ans));
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum=0;
        for(int i=row1; i<=row2; i++){
            if(col1==0) sum+=ans[i][col2];
            else sum+=(ans[i][col2]-ans[i][col1-1]);
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */