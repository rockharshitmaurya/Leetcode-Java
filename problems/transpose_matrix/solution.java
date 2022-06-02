class Solution {
    public int[][] transpose(int[][] matrix) {
        int n=matrix.length,m=matrix[0].length;
        int ans[][]=new int[m][n];
        int j=0;
        for(int arr[]:matrix){
            for(int i=0; i<arr.length; i++){
               ans[i][j]=arr[i]; 
            }
            j++;
        }
       return ans; 
    }
}