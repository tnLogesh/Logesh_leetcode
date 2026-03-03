class Solution {
    String getRev(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='0')sb.append("1");
            else sb.append("0");
        }
        return sb.reverse().toString();
    }
    public char findKthBit(int n, int k) {
        String str=new String("0");
        for(int i=1;i<n;i++){
            String temp=str+"1";
            str=temp+getRev(str);
        }
        return str.charAt(k-1);
    }
}