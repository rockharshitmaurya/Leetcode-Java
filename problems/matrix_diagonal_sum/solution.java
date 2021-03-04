class Solution {
    public int diagonalSum(int[][] mat) {
       int sum=0,index=0,len=mat.length;
        for(int i=0; i<len; i++){
            sum+=mat[i][i]+mat[i][len-i-1];
        }
        
        int row=(len/2);
        return len%2==0?sum:sum-mat[row][row];
    }
}