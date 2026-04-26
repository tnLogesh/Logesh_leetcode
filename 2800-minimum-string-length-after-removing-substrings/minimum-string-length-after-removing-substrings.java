class Solution {
    public int minLength(String s) {
        Stack<Character>stack=new Stack<>();
        int n=s.length();
        stack.push(s.charAt(0));
        for(int i=1;i<n;i++){
            char cur=s.charAt(i);
            if(!stack.isEmpty()){
                char top=stack.peek();
                if(top=='A'&&cur=='B')stack.pop();
                else if(top=='C'&&cur=='D')stack.pop();
                else stack.push(cur);
            }
            else stack.push(cur);
        }
        return stack.size();
    }
}