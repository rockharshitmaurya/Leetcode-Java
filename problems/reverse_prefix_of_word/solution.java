class Solution {
    public String reversePrefix(String word, char ch) {
       StringBuilder sb=new StringBuilder(word);
        int j=0,n=word.length();
        while(j<word.length() && word.charAt(j)!=ch) j++;
        if(j!=word.length())
        for(int i=0; i*2<j; i++){
            char temp=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j-i));
            sb.setCharAt(j-i,temp);
        }
        return sb.toString();
    }
}