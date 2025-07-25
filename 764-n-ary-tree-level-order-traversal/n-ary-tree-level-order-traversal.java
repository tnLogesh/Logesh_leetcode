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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>>l=new ArrayList<>();
        if(root==null)return l;
        Queue<Node>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer>l1=new ArrayList<>();
            int n=q.size();
            for (int i = 0; i < n; i++) {
                Node current = q.poll();
                l1.add(current.val);

                if (current.children != null) {
                    for (Node child : current.children) {
                        q.offer(child);
                    }
                }
            }
            l.add(l1);
        }
        return l;
    }
}