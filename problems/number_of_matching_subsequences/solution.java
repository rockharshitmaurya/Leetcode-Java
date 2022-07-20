class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        Trie root=createTrie(words);
        return dfs(s,root,0);
        
    }
    //this DFS part is not written by me
    private int dfs(String S, Trie root, int pos) {
        if (root == null) return 0;
        int index = S.indexOf(root.ch, pos);
        if (root.ch != '*' && index == -1) return 0;
        int res = root.score;
        for (int i = 0; i < 26; i++) {
            res += dfs(S, root.children[i], root.ch == '*' ? 0 : index + 1);
        }
        return res;
    }
    class Trie{
        char ch;
        int score;
        Trie children[];
        public Trie(char ch){
            this.ch=ch;
            score=0;
            children=new Trie[26];
        }
    }
    Trie createTrie(String words[]){
        Trie root=new Trie('*');
        for(String str:words){
            addNode(str,root);
        }
        return root;
    }
    void addNode(String str,Trie root){
        for(char ch:str.toCharArray()){
            if(root.children[ch-'a']==null){
                root.children[ch-'a']=new Trie(ch);   
            }
            root=root.children[ch-'a'];
        }
        root.score++;
    }
}