class Solution {
    public String maximumOddBinaryNumber(String s) {
        int[]freq=new int[2];
        for(char ch:s.toCharArray()){
            freq[ch-'0']++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<freq[1];i++)sb.append("1");
        for(int i=0;i<freq[0];i++)sb.append("0");
        sb.append("1");
        return sb.toString();
    }
}