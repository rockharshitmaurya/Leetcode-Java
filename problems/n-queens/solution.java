class Solution {
    public List<List<String>> solveNQueens(int n) {
       char[][] board = new char[n][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                board[i][j] = '.';
        
        List<List<String>> res = new ArrayList<List<String>>();
        dfs(board, 0, res);
        return res;  
    }
    
    void dfs(char chess[][],int row,List<List<String>> res){
        if(row==chess.length){
          res.add(construct(chess));
            return;
        }
        for(int col=0; col<chess.length; col++){
            if(chess[row][col]=='.' && isQueenSafe(chess,row,col)==true){
                chess[row][col]='Q';
                dfs(chess,row+1,res);
                chess[row][col]='.';
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
    
    List<String> construct(char chess[][]){
        List<String> res=new ArrayList<>();
        for(int i=0; i<chess.length; i++){
            res.add(new String(chess[i]));
        }
        return res;
    }

}
// ..Q.
// .Q..
// ...Q
// Q...
    