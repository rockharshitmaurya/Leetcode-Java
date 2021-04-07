class Solution {
    public boolean halvesAreAlike(String s) {
        int count=0,len=s.length();
        for(int i=0; i*2<len; i++){
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || 
              c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
                count++;
            }
            c=s.charAt(len-i-1);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || 
              c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
                count--;
            }
        }
        return count==0;
    }
}