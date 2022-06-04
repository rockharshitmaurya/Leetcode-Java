class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<List<String>>();
        char board[][]=new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]='.';
            }
        }
        helper(board,ans,0);
        return ans;
    }
    void helper(char board[][],List<List<String>> list,int row){
        if(row==board.length){
            list.add(answerMake(board));
            return;
        }
        for(int col=0; col<board.length; col++){
            if(board[row][col]=='.' && isQueenSafe(board,row,col)==true){
                board[row][col]='Q';
                helper(board,list,row+1);
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
    List<String> answerMake(char ch[][]){
        List<String> ans=new ArrayList<>();
        for(int i=0; i<ch.length; i++){
            ans.add(new String(ch[i]));
        }
        return ans;
    }
}