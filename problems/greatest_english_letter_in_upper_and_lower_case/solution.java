class Solution {
    public String greatestLetter(String s) {
        char ch[]=s.toCharArray();
        int lower[]=new int[26];
        int upper[]=new int[26];
        for(char c:ch){
            if(Character.isUpperCase(c)) upper[c-'A']++;
            else lower[c-'a']++;
        }
        Arrays.sort(ch);
        for(int i=ch.length-1; i>=0; i--){
            if(Character.isUpperCase(ch[i])) if(lower[ch[i]-'A']>0) return ch[i]+"";
        }
        return "";
    }
}