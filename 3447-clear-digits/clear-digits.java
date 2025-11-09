class Solution {
    public String clearDigits(String s) {
        Stack<Character>st=new Stack<>();
        for(char i:s.toCharArray()){
            if(!st.isEmpty()&&i>='0'&&i<='9'){
                st.pop();
            }
            else st.push(i);
        }
        StringBuilder sb=new StringBuilder();
        while(st.size()>0){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}