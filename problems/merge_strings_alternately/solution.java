class Solution {
    public String mergeAlternately(String word1, String word2) {
      StringBuilder str=new StringBuilder();
        int len=word1.length()>word2.length()?word1.length():word2.length();
        for(int i=0,j=0; i<len; i++, j++){
            if(i<word1.length()){
                str.append(word1.charAt(i));
            }
            if(j<word2.length()){
                str.append(word2.charAt(j));
            }
        }
        return str.toString();
        // int n = word1.length();
        // int m = word2.length();
        // int i = 0;
        // StringBuilder sb = new StringBuilder();
        // while (i < n && i < m) {
        //     sb.append(word1.charAt(i));
        //     sb.append(word2.charAt(i));
        //     i++;
        // }
        // while (i < n) {
        //     sb.append(word1.charAt(i));
        //     i++;
        // }
        // while (i < m) {
        //     sb.append(word2.charAt(i));
        //     i++;
        // }
        // return sb.toString();
    }
}