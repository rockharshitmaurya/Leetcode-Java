class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
       List<String> list =new ArrayList<>();
        pattern=normal(pattern);
        // System.out.println(normal("mkk"));        
        for(String str:words){
           if(pattern.startsWith(normal(str))){
               list.add(str);
           } 
        }
        return list;
    }
    String normal(String str){
        StringBuilder sb=new StringBuilder();
        HashMap<Character,Character> map=new HashMap<>();
        char ch='a';
        for(int i=0; i<str.length(); i++){
            char key=str.charAt(i);
            map.put(key,map.getOrDefault(key,ch++));
            sb.append(map.get(key));
            // System.out.print(ch+" ");
        }
        // sb.append(count);
        return sb.toString();
    }
}
