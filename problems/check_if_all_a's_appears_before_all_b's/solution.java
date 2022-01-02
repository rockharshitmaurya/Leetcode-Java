class Solution {
    public boolean checkString(String s) {
        int j=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='b'){
                j=1;
            }
            if(j==1 && s.charAt(i)=='a'){
                return false;
            }
        }
        return true;
    }
}