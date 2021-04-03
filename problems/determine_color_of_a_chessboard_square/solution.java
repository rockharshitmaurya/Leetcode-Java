class Solution {
    public boolean squareIsWhite(String c) {
        int f=(int)c.charAt(0);
        int n=Character.getNumericValue(c.charAt(1));
        if(f%2!=0 && n%2!=0 || f%2==0 && n%2==0 ) return false;
        return true;   
    }
}