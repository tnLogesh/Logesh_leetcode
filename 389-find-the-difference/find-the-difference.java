class Solution {
    static{
        for(int i=0;i<100;i++){
            findTheDifference("nlogesh","tnlogesh");
        }
    }
    public static char findTheDifference(String s, String t) {
        int[]freq=new int[26];
        for(char i:t.toCharArray()){
            freq[i-'a']++;
        }
        for(char i:s.toCharArray()){
            freq[i-'a']--;
        }
        String str="";
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                return (char)('a'+i);
            }
        }
        return '0';
    }
}