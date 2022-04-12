class Solution {
    public void gameOfLife(int[][] board) {
        int ans[][]=new int[board.length][board[0].length];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                int num=count_one(board,i,j);
                if(board[i][j]==1){
                    ans[i][j]=(num==2 || num==3)?1:0;
                }else{
                    ans[i][j]=num==3?1:0; 
                }
            }
        }
        for(int i=0; i<board.length; i++)
            for(int j=0; j<board[0].length; j++) board[i][j]=ans[i][j];
        // System.out.println(Arrays.deepToString(ans));
    }
    int count_one(int arr[][],int i,int j){
        int m=arr.length,n=arr[0].length;
        int count=0;
        if((j+1)<n && arr[i][j+1]==1) count++;
        if((j-1)>-1 && arr[i][j-1]==1) count++;
        if((i-1)>-1 && arr[i-1][j]==1) count++;
        if((i+1)<m && arr[i+1][j]==1) count++;
        if((i-1)>-1 && (j+1)<n && arr[i-1][j+1]==1) count++;
        if((i-1)>-1 && (j-1)>-1 && arr[i-1][j-1]==1) count++;
        if((i+1)<m && (j+1)<n && arr[i+1][j+1]==1) count++;
        if((i+1)<m && (j-1)>-1 && arr[i+1][j-1]==1) count++;
        return  count;
    }
}