/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    int max=0;
    public int maxDepth(Node root) {
        if(root==null) return 0;
        int ht=0; //in case of Height of edges else ht=0;(case of node)
		for(Node child:root.children) {
			int ch=maxDepth(child);
			ht=Math.max(ch, ht);
		}
		ht+=1;
		return ht;
    }
}