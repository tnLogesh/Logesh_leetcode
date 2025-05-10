class Solution {
    public boolean isValid(String s) {
        int len=s.length();
        char[]arr=s.toCharArray();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<len;i++){
            if(arr[i]=='{'||arr[i]=='('||arr[i]=='['){
                st.push(arr[i]);
            }
            else{
                if(st.isEmpty()||
                (arr[i]=='}'&&st.pop()!='{')||
                (arr[i]==']'&&st.pop()!='[')||
                (arr[i]==')'&&st.pop()!='(')){
                    return false;}
            }
        }
        return st.isEmpty();
    }
}