class Solution {
    public int minSteps(String s, String t) {
    int freq[]=new int[26];
        for(char c: s.toCharArray()){
            freq[c-'a']++;
        }
        for(char c:t.toCharArray()){
            if(freq[c-'a']>0) freq[c-'a']--;
        }
        int sum=0;
        for(int i:freq){
            if(i>0) sum+=i;
        }
        return sum;
    }
}
    