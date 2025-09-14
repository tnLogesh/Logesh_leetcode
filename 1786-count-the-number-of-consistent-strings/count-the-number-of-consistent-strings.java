class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c=0;
        for(String i:words){
            if(isValid(i,allowed))c++;
        }
        return c;
    }
    boolean isValid(String str,String m){
        for(char i:str.toCharArray()){
            if(!m.contains(i+""))return false;
        }
        return true;
    }
}