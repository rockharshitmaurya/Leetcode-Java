class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length==0 || matrix[0].length==0) return false;
//         for(int i=0; i<matrix.length; i++){
//             for(int j=matrix[i].length-1; j>=0; j--){
//                 if(matrix[i][j]==target){
//                     return true;
//                 }else if(matrix[i][j]<target){
//                     i++;
//                 }
//                 System.out.print(matrix[i][j]+" ");
//             }
            
//             System.out.println();
//         }
        int colunm=matrix[0].length-1,row=matrix.length,i=0;
        while(colunm>=0 && i<row){
            if(matrix[i][colunm]==target){
                return true;
            }else if(matrix[i][colunm]>target){
                colunm--;    
            }else{
                i++;
            }
        }
        
            
            return false;
    }
}