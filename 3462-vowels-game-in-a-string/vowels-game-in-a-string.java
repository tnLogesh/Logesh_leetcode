class Solution {
    public boolean doesAliceWin(String s) {
        String str="";
        for(char ch:s.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                str+=ch;
            }
        }
        if(str.length()==0)return false;
        return true;
    }
}