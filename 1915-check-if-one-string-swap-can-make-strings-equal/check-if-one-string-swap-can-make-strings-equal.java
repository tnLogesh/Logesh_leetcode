class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int c=0;
        int n=s1.length();
        if(n!=s2.length())return false;
        int[]freq=new int[26];
        for(char ch:s1.toCharArray())freq[ch-'a']++;
        for(char ch:s2.toCharArray())freq[ch-'a']--;
        for(int i:freq){
            if(i!=0)c++;
        }
        if(c!=0)return false;
        for(int i=0;i<n;i++){
            if(s1.charAt(i)!=s2.charAt(i))c++;
        }
        return c<3;
    }
}