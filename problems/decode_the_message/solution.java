class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map=new HashMap<>();
        char val='a';
        for(char ch:key.toCharArray()){
            if(ch==' ') continue;
            if(!map.containsKey(ch)){
                map.put(ch,val++);
            }
        }
        String ans="";
        for(char ch:message.toCharArray()){
            if(ch==' ') ans+=ch;
            else ans+=map.get(ch);
        }
        return ans;
    }
}