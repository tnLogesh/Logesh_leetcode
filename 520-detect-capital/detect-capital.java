class Solution {
    public boolean detectCapitalUse(String word) {
        int c=0;
        for(char i:word.toCharArray()){
            if(i>='a'&&i<='z')c++;
        }
        if(c==word.length())return true;
        c=0;
        for(char i:word.toCharArray()){
            if(i>='A'&&i<='Z')c++;
        }
        if(c==word.length())return true;
        c=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(0)>='A'&&word.charAt(0)<='Z'){
                if(i!=0&&word.charAt(i)>='a'&&word.charAt(i)<='z')c++;
            }
        }
        if(c==word.length()-1)return true;
        return false;
    }
}