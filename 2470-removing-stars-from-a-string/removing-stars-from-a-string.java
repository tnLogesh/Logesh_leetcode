class Solution {
    public String removeStars(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='*'){
                st.push(s.charAt(i));
            }
            else if(!st.isEmpty()){
                st.pop();
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop()+"");
        }
        String str=sb.reverse().toString();
        return str;
    }
}