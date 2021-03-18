class Solution {
    public boolean judgeCircle(String moves) {
        int l=0,r=0,u=0,d=0;
        for(char c:moves.toCharArray()){
            //  if(c=='L' && r!=0){
            //    r--;
            // }else if(c=='R' && l!=0){
            //     l--;
            // }else if(c=='U' && d!=0){
            //     d--;
            // }else if(c=='D' && u!=0){
            //     u--;
            // }else 
            if(c=='L'){
               
                l++;
            }else if(c=='R'){
               
                l--;;
            }else if(c=='U'){
              
                u++;
            }else if(c=='D'){
              
                u--;
            }
        }
        return (l==0 && u==0);
        //return (l==0 && r==0 && u==0 && d==0)?true:false;
    }
}