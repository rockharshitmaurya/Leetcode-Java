class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int i=1;
        for(String str:sentence.split(" ")){
            if(str.startsWith(searchWord)) return i;
            i++;
        }
        return -1;
    }
}