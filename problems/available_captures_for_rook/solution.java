class Solution {
    public int numRookCaptures(char[][] board) {
        int i=0,j=0,res=0;
        outer:
        for(; i<8; i++){
            for(j=0; j<8; j++){
                 if(board[i][j]=='R'){
                    // System.out.println(board[i][j]);
                    break outer;
                }
            }
        }
        for(int l=j; l<8; l++){
            if(board[i][l]=='B') break;
            else if(board[i][l]=='p'){
                res++;
                break;
            }
        }
          for(int l=j; l>=0; l--){
            if(board[i][l]=='B') break;
            else if(board[i][l]=='p'){
                res++;
                break;
            }
        }
          for(int l=i; l<8; l++){
            if(board[l][j]=='B') break;
            else if(board[l][j]=='p'){
                res++;
                break;
            }
        }
           for(int l=i; l>=0; l--){
            if(board[l][j]=='B') break;
            else if(board[l][j]=='p'){
                res++;
                break;
            }
        }
        return res;
    }
}