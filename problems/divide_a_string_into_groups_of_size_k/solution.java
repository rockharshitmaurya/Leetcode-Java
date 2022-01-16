class Solution {
    public String[] divideString(String s, int k, char fill) {
      int len=(s.length()%k==0)?s.length():s.length()+k-(s.length()%k);
        
        String res[]=new String[len/k];
        int start=s.length();
        if(len>start){
        for(int i=start; i<len; i++){
            s=s+fill;
        }
            System.out.println(s);
           
        }
         int j=0;
            for(int a=0; a<=s.length()-k; a+=k){
                res[j++]=s.substring(a,(a+k));
            }
        return res;
    }
}