class Solution {
    public String decodeString(String s) {
        Stack<String>st=new Stack<>();
        String closeBracket="]";
        for(char ch:s.toCharArray()){
            if(!closeBracket.equals(ch+""))st.push(ch+"");
            else{
                String str="";
                while(!st.isEmpty()){
                    if(st.peek().equals("["))st.pop();
                    else if(st.peek().charAt(0)>='0'&&st.peek().charAt(0)<='9'){
                        StringBuilder num=new StringBuilder();
                        while(!st.isEmpty()&&st.peek().charAt(0)>='0'&&st.peek().charAt(0)<='9'){
                            num.append(st.pop().charAt(0)-'0');
                        }
                        str=str.repeat(Integer.parseInt(num.reverse().toString()));
                        st.push(str);
                        break;
                    }
                    else str+=st.pop();
                }
            }
        }
        String str="";
        while(!st.isEmpty()){
            //StringBuilder sb=new StringBuilder(st.pop());
            str+=st.pop();
        }
        return new StringBuilder(str).reverse().toString();
    }
    int Reverse(int num){
        int n=0;
        while(num>0){
            int rem=num%10;
            n=n*10+rem;
            num/=10;
        }
        return n;
    }
}