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
}
*/

class Solution {
    void postOrder(Node node,List<Integer>l){
        if(node==null)return;
        int n=node.children.size();
        for(int i=0;i<n;i++){
            postOrder(node.children.get(i),l);
        }
        l.add(node.val);
    }
    public List<Integer> postorder(Node root) {
        List<Integer>l=new ArrayList<>();
        postOrder(root,l);
        return l;
    }
}