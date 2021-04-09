class Solution {
     TreeMap<Character,Integer> map=new TreeMap<>();
    public boolean isAlienSorted(String[] words, String order) {
        for(int i=0; i<order.length(); i++)
            map.put(order.charAt(i),i);
        for(int i=0; i<words.length-1; i++){
             if(isEqual(words[i],words[i+1])){
                    return false;
             } 
        }
        
            
        
        return true;   
    }
    boolean isEqual(String first, String second){
        int f=first.length(),s=second.length();
        for(int i=0; i<f && i<s; i++){
            if(first.charAt(i)!=second.charAt(i)){
                 return map.get(first.charAt(i))>map.get(second.charAt(i));
            }
        }
        return f>s;
    }
}