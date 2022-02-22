class Solution {
    public String convertToTitle(int n) {
StringBuffer sb = new StringBuffer();
        while(n>0){
            char tmp = (char)((n%26==0?26:n%26)+64);
            sb.append(tmp);
            n =(n%26==0? n/26-1: n/26);
        }
        return sb.reverse().toString();
    }
}
// 26*0+25-->ans*26+2