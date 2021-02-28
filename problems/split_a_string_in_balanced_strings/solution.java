class Solution {
    public int balancedStringSplit(String s) {
      int res=0,R=0,L=0;
        for(char c:s.toCharArray()){
          R+=(c=='R')?1:0;
          L+=(c=='L')?1:0;
            if(R==L){
                res++;
                R=0;
                L=0;
            }
      }
        return res;
    }
}