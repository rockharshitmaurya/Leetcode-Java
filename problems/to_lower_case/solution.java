class Solution {
    public String toLowerCase(String str) {
      StringBuffer st=new StringBuffer();
        for(char c:str.toCharArray()){
            if(c>=65 && c<=90){
                c=((char)(c+32));
            }
            st.append(c);
        }
        return st.toString();
    }
}