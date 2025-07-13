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
    List<Integer> postOrder(Node cur,List<Integer>l){
        if(cur==null){
            return l;
        }
        for(Node i:cur.children){
            postOrder(i,l);
        }
        l.add(cur.val);
        return l;
    }
    public List<Integer> postorder(Node root) {
        List<Integer>l=new ArrayList<>();
        if(root==null){
            return l;
        }
        return postOrder(root,l);
    }
}