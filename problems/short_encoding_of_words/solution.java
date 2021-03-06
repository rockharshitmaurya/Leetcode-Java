class Solution {
    public int minimumLengthEncoding(String[] words) {
       HashSet<String> set=new HashSet<>(Arrays.asList(words));
        
        for(String word:words)
            for(int i=1; i<word.length(); i++)
                set.remove(word.substring(i));
        
        int res=0;
        for(String s:set) res+=s.length()+1;
        
        return res;
    }
}