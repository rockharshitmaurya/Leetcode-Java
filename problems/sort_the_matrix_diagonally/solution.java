class Solution {
    public int[][] diagonalSort(int[][] A) {
        int row=A.length,col=A[0].length;
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int j=0; j<row; j++){
            for(int i=0,r=j; r<row && i<col; i++,r++){
                list.add(A[r][i]);  
            }
            Collections.sort(list);
            for(int i=0,r=j; r<row && i<col; i++,r++){
                A[r][i]=list.remove(0);  
               
            }
        }
      for(int j=1; j<col; j++){
            for(int i=j,c=0; c<row && i<col; i++,c++){
                list.add(A[c][i]); 
            }
             Collections.sort(list);
            for(int i=j,c=0; c<row && i<col; i++,c++){
                A[c][i]=list.remove(0);           
            }
      }
        return A;
        
    }
}
