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
    public List<Integer> preorder(Node root) {
        if(root==null)return new ArrayList<>();
        Stack<Node>st=new Stack<>();
        List<Integer>ans=new ArrayList<>();
        st.push(root);
        while(!st.isEmpty()){
            Node temp=st.peek();
            st.pop();
            ans.add(temp.val);
            for(int i=temp.children.size()-1;i>=0;i--){
                st.push(temp.children.get(i));
            }
        }
        List<Integer>l=new ArrayList<>();
        for(int i:ans){
            l.add(i);
        }
        return l;
    }
}