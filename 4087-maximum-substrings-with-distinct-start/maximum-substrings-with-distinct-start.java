class Solution {
    public int maxDistinct(String s) {
        int[]freq=new int[26];
        for(char i:s.toCharArray()){
            freq[i-'a']++;
        }
        int count=0;
        for(int i:freq){
            if(i>0)count++;
        }
        return count;
    }
}