class Solution {
    public int minAddToMakeValid(String S) {
      int open=0,close=0,res=0;
        for(int i=0; i<S.length(); i++){
            if(S.charAt(i)=='('){
                open++;
            }else if(open>0){
                open--;
            }else{
                close++;
            }
            
            
            
        }
        
        return open+close;
    }
}