class Solution {
    public String firstPalindrome(String[] words) {
        outer:
        for(String word:words){
        int n=word.length();
        for(int i=0; i<n/2; i++){
            if(word.charAt(i)!=word.charAt(n-1-i)){
                continue outer;
            }
        }
            return word;
    }
        return "";
    }
}