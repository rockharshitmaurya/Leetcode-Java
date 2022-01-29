class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int res[]=new int[s.length()];
        label:
        for(int i=0; i<s.length(); i++){
            int a=startPos[0],b=startPos[1],count=0;
            for(int j=i; j<s.length(); j++){
               // System.out.println(s.substring(j));
                if(s.charAt(j)=='R'){
                 if((b+1)<n){
                     b++;
                     count++;
                 }else{
                     res[i]=count;
                     continue label;
                 }  
                }else if(s.charAt(j)=='L'){
                    if((b-1)>=0){
                     b--;
                     count++;
                 }else{
                     res[i]=count;
                     continue label;
                 }
                }else if(s.charAt(j)=='U'){
                    if((a-1)>=0){
                     a--;
                     count++;
                 }else{
                     res[i]=count;
                     continue label;
                 }
                }else if(s.charAt(j)=='D'){
                    if((a+1)<n){
                     a++;
                     count++;
                 }else{
                     res[i]=count;
                     continue label;
                 }
                }
            }
            res[i]=count;
        }
        return res;
    }
}