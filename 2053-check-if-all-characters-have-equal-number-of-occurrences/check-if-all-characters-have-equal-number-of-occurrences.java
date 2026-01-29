class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[]freq=new int[26];
        for(char i:s.toCharArray()){
            freq[i-'a']++;
        }
        int check=0;
        for(int i:freq){
            if(i!=0&&check==0)check=i;
            else if(i!=0&&i!=check)return false;
        }
        return true;
    }
}