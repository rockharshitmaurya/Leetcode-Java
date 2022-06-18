class TrieNode{
    TrieNode children[];
    int weight;
    TrieNode(){
        children=new TrieNode[27];
        weight=0;
    }
}
class WordFilter {
    TrieNode root;
    public WordFilter(String[] words) {
        root=new TrieNode();
        for(int i=0; i<words.length; i++){
            String word=words[i]+"{";
            for(int j=0; j<words[i].length(); j++){
                TrieNode ptr=root;
                ptr.weight=i;
                for(int k=j; k<2*word.length()-1; k++){
                    // System.out.print(word.charAt(k%word.length()));
                    int val=word.charAt(k%word.length())-'a';
                    if(ptr.children[val]==null)
                        ptr.children[val]=new TrieNode();
                    ptr=ptr.children[val];
                    ptr.weight=i;
                }
                // System.out.print(" ");
            }
        }
    }
    public int f(String prefix, String suffix) {
        TrieNode ptr=root;
        for(char c:(suffix+"{"+prefix).toCharArray()){ //ulta pahle suffix fir prefix
            if(ptr.children[c-'a']==null) return -1;
            ptr=ptr.children[c-'a'];
        }
        return ptr.weight;
    }
}

/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(prefix,suffix);
 */