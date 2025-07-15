class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        int v=0;
        int c=0;
        word=word.replaceAll("[aeiouAEIOU]","a");
        word=word.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]","b");
        for(char i:word.toCharArray()){
            if(i=='a')v++;
            else if(i=='b')c++;
            else if(i>='0'&&i<='9')continue;
            else{
                return false;
            }
        }
        if(v>0&&c>0)return true;
        return false;
    }
}