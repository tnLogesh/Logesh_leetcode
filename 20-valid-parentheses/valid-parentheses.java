class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        int n=s.length();
        char ch=s.charAt(0);
        if(ch==')'||ch=='}'||ch==']'||n%2!=0){
            return false;
        }
        for(int i=0;i<n;i++){
            ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }
            else{
               if(!st.isEmpty()){
                    switch(ch){
                    case ')':{if(st.peek()=='('){st.pop();break;}else return false;}
                    case '}':{if(st.peek()=='{'){st.pop();break;}else return false;}
                    case ']':{if(st.peek()=='['){st.pop();break;}else return false;}
                    default:{return false;}
                }
               }
               else {
                return false;
               }
            }
        }
        return st.isEmpty();
    }
}