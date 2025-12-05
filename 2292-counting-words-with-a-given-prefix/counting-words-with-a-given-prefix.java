class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        int n=pref.length();
        for(String i:words){
            if(i.length()>=n&&i.substring(0,n).equals(pref)){
                count++;
            }
        }
        return count;
    }
}