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
    void preOrder(Node node,List<Integer>l){
        if(node==null)return;
        int size = node.children.size();
        l.add(node.val);
		for(int i=0; i<=size-2; i++)
		{
			preOrder(node.children.get(i),l);
		}
		if(size>0)preOrder(node.children.get(size-1),l);
    }
    public List<Integer> preorder(Node root) {
        List<Integer>l=new ArrayList<>();
        preOrder(root,l);
        return l;
    }
}