class Solution {
    public int minSteps(String s, String t) {
        int count[]=new int[26];
        int count2[]=new int[26];
        for(char c:s.toCharArray()) count[c-'a']++;
        for(char c:t.toCharArray()) count2[c-'a']++;
        int res=0;
        for(int i=0; i<26; i++){
            res+=Math.abs(count[i]-count2[i]);
        }
        return res;
    }
}