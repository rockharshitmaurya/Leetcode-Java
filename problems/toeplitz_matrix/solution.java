class Solution {
    public boolean isToeplitzMatrix(int[][] mx) {
        int n=mx.length,m=mx[0].length;
        //        while(true){
           
//       }
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(mx[i-1][j-1]!=mx[i][j]) return false;
            }
        }
        return true;
    }
}