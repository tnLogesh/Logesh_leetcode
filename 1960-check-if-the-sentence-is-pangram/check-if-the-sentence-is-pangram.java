class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26)return false;
        char a='a';
        for(int i=0;i<26;i++){
            if(sentence.indexOf(a)==-1){
                return false;
            }
            a++;
        }
        return true;
    }
}