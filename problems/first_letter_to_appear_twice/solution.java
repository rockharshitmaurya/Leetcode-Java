class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        
        for(char ch:s.toCharArray()){
            if(map.containsKey(ch)) return ch;
            
            map.put(ch,1);
        }
        
        return 'a';
    }
}