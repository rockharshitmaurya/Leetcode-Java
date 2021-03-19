class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int len=s.length()-1,ret=0;
        while(len>=0){
            if(s.charAt(len--)!=' ')  ret++; 
            else return ret;
            
        }
        //if(len==0) return s.length();
        return ret;
    }
}