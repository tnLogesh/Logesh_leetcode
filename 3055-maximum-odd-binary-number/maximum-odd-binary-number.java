class Solution {
    public String maximumOddBinaryNumber(String s) {
        int[]freq=new int[2];
        for(char ch:s.toCharArray()){
            freq[ch-'0']++;
        }
        String str="";
        for(int i=1;i<freq[1];i++)str+="1";
        for(int i=0;i<freq[0];i++)str+="0";
        return str+"1";
    }
}