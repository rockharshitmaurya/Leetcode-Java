class Solution {
    public String freqAlphabets(String s) {
     StringBuilder str=new StringBuilder();
        int len=s.length();
        for(int i=0; i<len; i++){
           if(i<len-2 && s.charAt(i+2)=='#'){
               str.append((char)((Integer.parseInt(s.substring(i,i+2)))+96));
               i+=2;
               continue;
           } 
            str.append((char)(97 + s.charAt(i) - '1'));
        }
        return str.toString();
    }
}