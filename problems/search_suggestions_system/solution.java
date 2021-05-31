class Solution {
    class TrieNode {

        char ch;

        boolean isEnd;

        List<Integer> top;

        int count;

        List<TrieNode> children;

        

        TrieNode(char ch, boolean isEnd, int count) {

            this.ch = ch;

            this.isEnd = isEnd;

            this.count = count;

            this.children = new LinkedList<TrieNode>();

            this.top = new ArrayList<Integer>();

        }

        

        public void addChild(TrieNode node) {

            this.children.add(node);

        }

        

        public void setCount(int count) {

            this.count = count;

        }

        

        public void setEnd(boolean end) {

            this.isEnd = end;

        }

        

        public int getCount() {

            return this.count;    

        }

        

        public TrieNode getChild(char ch) {

            for(TrieNode node:this.children) {

                if(ch == node.ch) {

                    return node;

                }

            }

            

            return null;

        }

    }

    

    class Trie {

        TrieNode root = null;

        

        Trie() {

            root = new TrieNode(' ', true, 0);

        }

        

        public void add(String product, int index) {

            int size = product.length();

            int i = 1;

            TrieNode temp = root;

            for(char ch: product.toCharArray()) {

                boolean isEnd = false;

                if(i == size) {

                    isEnd = true;

                }

                

                TrieNode node = temp.getChild(ch);

                if(node != null) {

                    node.setCount(node.getCount() + 1);

                    node.setEnd(isEnd);

                }else{

                    node = new TrieNode(ch, isEnd, 1);

                    temp.children.add(node);   

                }

                

                if(node.top.size() < 3) {

                    node.top.add(index);

                }

                

                temp = node;

                

                i++;

            }

        }

        public void print(TrieNode root) {

            TrieNode temp = root;

            

            for(TrieNode node:temp.children) {

                System.out.println(node.ch + " " + node.count);

                print(node);

            }

        }

        

        public List<Integer> getTop(String prefix) {

            TrieNode temp = this.root;

            

            for(char ch:prefix.toCharArray()) {

                if(temp == null) {

                    break;

                }

                TrieNode node = temp.getChild(ch);

                temp = node;

            }

            

            return temp != null? temp.top : new ArrayList<Integer>();

        }

    }

    

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {

        Trie dict = new Trie();

        Arrays.sort(products);

        List<List<String>> res = new ArrayList<List<String>>();

        

        int i=0;

        for(String product:products) {

            dict.add(product, i);

            i++;

        }

        

        String prefix = "";

        

        for(char ch:searchWord.toCharArray()) {

            prefix += ch;

            List<Integer> cur = dict.getTop(prefix);

            ArrayList<String> level = new ArrayList<String>();

            

            for(Integer id:cur) {

                level.add(products[id]);

            }

            

            res.add(level);

        }

        

        return res;

    }
        

}