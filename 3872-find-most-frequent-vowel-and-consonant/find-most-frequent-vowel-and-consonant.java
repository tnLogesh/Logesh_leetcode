class Solution {
    public int maxFreqSum(String s) {
        int[]freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        int vl=0;
        int cl=0;
        for(int i=0;i<26;i++){
            if(i==0||i==4||i==8||i==14||i==20){
                if(vl<freq[i])vl=freq[i];
            }
            else{
                if(cl<freq[i])cl=freq[i];
            }
        }
        return vl+cl;
    }
}