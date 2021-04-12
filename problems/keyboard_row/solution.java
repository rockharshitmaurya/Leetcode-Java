class Solution {
    public String[] findWords(String[] words) {
        String[] strs = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<strs.length; i++){
            for(char c: strs[i].toCharArray()){
                map.put(c, i);//put <char, rowIndex> pair into the map
            }
        }
        // System.out.println(map.containsKey((char)('l'-32)));
        ArrayList<String> ar=new ArrayList<>();
        label:
        for(String str:words){
            char key=(char)(str.charAt(0) & 0x5f);
            int i=map.get(key);
            // System.out.println(i+" "+key);
            for(char c:str.toCharArray()){
                key=Character.toUpperCase(c);
                 // System.out.println(i+" "+key);
                if(map.get(key)!=i) continue label; 
            }
           ar.add(str); 
        }
        return ar.toArray(new String[0]);
    }
}