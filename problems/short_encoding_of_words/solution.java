class Trie{
    Trie links[]=new Trie[26];
    boolean isEnd=false;
    public Trie(){
        
    }
    boolean containsKey(char ch){
        return links[ch-'a']!=null;
    }
    Trie get(char ch){
        return links[ch-'a'];
    }
    void setEnd(){
        this.isEnd=true;
    }
    boolean isEnd(){
        return isEnd;
    }
    void put(char ch,Trie node){
        links[ch-'a']=node;
    }
    
}
class Solution {
    public int minimumLengthEncoding(String[] words) {
        Arrays.sort(words, (a, b)->Integer.compare(b.length(), a.length()));
        Trie root=new Trie();
        int ans=0;
        for(String str:words){
            Trie ptr=root;
            boolean isFound=false;
            for(int i=str.length()-1; i>=0; i--){
                char ch=str.charAt(i);
                if(!ptr.containsKey(ch)){
                     ptr.put(ch,new Trie());
                     isFound=true;
                }
                ptr=ptr.get(ch);
            }
            if(isFound) ans+=(str.length()+1);
        }
        return ans;
    }
}
//time#bell#el#