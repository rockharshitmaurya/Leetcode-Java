class Solution {
    int count=0;
    public int totalNQueens(int n) {
        char board[][]=new  char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]='.';
            }
        }
        helper(board,0);
      return count;  
    }
    void helper(char board[][],int row){
        if(row==board.length){
            count++;
            return;
        }
        for(int col=0; col<board.length; col++){
            if(board[row][col]=='.' && isQueenSafe(board,row,col)){
                board[row][col]='Q';
                helper(board,row+1);
                board[row][col]='.';
            }
        }
    }
     boolean isQueenSafe(char chess[][],int row,int col){
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(chess[i][j] == 'Q'){
                return false;
            }
        }

        for(int i = row - 1, j = col; i >= 0; i--){
            if(chess[i][j] == 'Q'){
                return false;
            }
        }

        for(int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++){
            if(chess[i][j] == 'Q'){
                return false;
            }
        }

        for(int i = row, j = col - 1; j >= 0; j--){
            if(chess[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }
}