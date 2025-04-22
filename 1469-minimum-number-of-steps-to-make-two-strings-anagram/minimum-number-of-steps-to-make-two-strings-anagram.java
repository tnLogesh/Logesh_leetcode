class Solution {
    public int minSteps(String s, String t) {
        int c=0;
        int[]freq=new int[26];
        for(char i:s.toCharArray()){
            freq[i-'a']++;
        }
        for(char i:t.toCharArray()){
            freq[i-'a']--;
        }
        for(int i:freq){
            if(i>0)c+=i;
        }
        return c;
    }
}