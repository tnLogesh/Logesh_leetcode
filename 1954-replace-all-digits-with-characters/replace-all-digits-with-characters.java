class Solution {
    public String replaceDigits(String s) {
        String result="";
        int n=s.length();
        char prev=s.charAt(0);
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch>='0'&&ch<='9'){
                result+=((char)(prev+(ch-'0')))+"";
            }
            else{
                result+=ch;
                prev=ch;
            }
        }
        return result;
    }
}