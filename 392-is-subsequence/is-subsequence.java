class Solution {
    public boolean isSubsequence(String s, String t) {
        String str=t;
        int c=0;
        int a=0;
        for(int i=0;i<str.length()&&a<s.length();i++){
            if(str.charAt(i)==s.charAt(a)){
                c++;a++;
                if(c==s.length()){
                    return true;
                }
            }
        }
        return c==s.length();
    }
}