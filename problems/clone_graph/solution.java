/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        return copyGraph(node,new HashMap<Integer,Node>());
    }
    Node copyGraph(Node node,HashMap<Integer,Node> map){
       if(node==null) return null;
        if(map.containsKey(node.val)) return map.get(node.val);
        Node root=new Node(node.val, new ArrayList<Node>());
        map.put(root.val,root);
        for(Node num:node.neighbors){
            root.neighbors.add(copyGraph(num,map));
       }
        return root;
    }
}