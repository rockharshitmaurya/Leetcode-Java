class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        label:
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j]==target) return true;
                if(matrix[i][j]>target) continue label;
            }
        }
            
            return false;
    }
}