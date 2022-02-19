class Node{
    Node links[];
    boolean flag;
    public Node(){
        links=new Node[26];
        flag=false;
    }
    boolean containsKey(char c){
        return links[c-'a']!=null;
    }
    Node get(char c){
        return links[c-'a'];
    }
    void put(char c,Node toadd){
        links[c-'a']=toadd;
    }
    void setEnd(){
        flag=true;
    }
    boolean isEnd(){
        return flag;
    }
       
}
class Trie {
    Node root;
    public Trie() {
        root=new Node();
    }
    
    public void insert(String word) {
        Node node=root;
        for(char c:word.toCharArray()){
            if(!node.containsKey(c)){
                node.put(c,new Node());
            }
            node=node.get(c);            
        }
        node.setEnd();
        
    }
    
    public boolean search(String word) {
        Node node=root;
        for(char c:word.toCharArray()){
            if(!node.containsKey(c)) return false;
            
            node=node.get(c);
        }
        return node.isEnd();
    }
    
    public boolean startsWith(String prefix) {
        Node node=root;
        for(char c:prefix.toCharArray()){
            if(!node.containsKey(c)) return false;
            node=node.get(c);
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */