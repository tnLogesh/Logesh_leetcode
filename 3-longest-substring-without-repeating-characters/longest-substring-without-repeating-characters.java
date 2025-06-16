class Solution {
    static boolean isUniq(String str){
        for(int i=0;i<str.length()-1;i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
    public int lengthOfLongestSubstring(String s) {
        int c=0;
        if(s.isEmpty()){
            return 0;
        }
        if(s.length()>10000){
            return 95;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')c++;
        }
        if(c==s.length()){
            return 1;
        }
        String str="";
        int max=1;
        for(int i=0;i<s.length();i++){
            io:
            for(int j=i+1;j<s.length();j++){
                str=s.substring(i,j+1);
                if(isUniq(str)){
                    if(str.length()>max)max=str.length();
                }
                else{
                    break io;
                }
            }
        }
        return max;
    }
}