class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> ans=new ArrayList<>();
        pattern=normalize(pattern);
        for(String str:words){
            String nor_str=normalize(str);
            if(nor_str.equals(pattern)){
                ans.add(str);
            }
        }
        return ans;
    }
    String normalize(String str){
        
        int hash[]=new int[26];
        
        StringBuilder sb=new StringBuilder();
        
        for(int i=0; i<str.length(); i++){
              int ch=str.charAt(i)-'a';
              if(hash[ch]==0) hash[ch]=i+1;
              sb.append(hash[ch]);
            
        }
        return sb.toString();
    }
}

    
