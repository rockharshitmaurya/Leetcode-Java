class Node{
    Node links[]=new Node[2];
    
    boolean containsKey(int num){
        return links[num]!=null;
    }
    Node get(int num){
        return links[num];
    }
    void put(int num,Node node){
        links[num]=node;
    }
}
class Trie{
    Node root;
    Trie(){
        root=new Node();
    }
   public  void insert(int num){
       Node node=root;
       for(int i=31; i>=0; i--){
           int bit=(num>>i)&1;
           if(!node.containsKey(bit)){
               node.put(bit,new Node());
           }
           node=node.get(bit);
       }
    }
    
    int getMax(int num){
        Node node=root;
        int maxnum=0;
        for(int i=31; i>=0; i--){
            int bit=(num>>i)&1;
            if(node.containsKey(1-bit)){
                maxnum=maxnum | (1<<i);
                node=node.get(1-bit);
            }else{
                node=node.get(bit);
            }
        }
        return maxnum;
    }
}
class Solution {
    public int findMaximumXOR(int[] nums) {
        Trie root=new Trie();
        for(int num:nums){
           root.insert(num); 
        }
        int max=0;
        for(int num:nums){
            max=Math.max(max,root.getMax(num));
        }
        return max;
    }
}