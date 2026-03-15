class Solution {
    public String customSortString(String order, String s) {
        String result=new String();
        int[]freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        for(char i:order.toCharArray()){
            while(freq[i-'a']>0){
                result+=i;
                freq[i-'a']--;
            }
        }
        for(char i:s.toCharArray()){
            if(!result.contains(i+"")){
                while(freq[i-'a']>0){
                result+=i;
                freq[i-'a']--;
            }
            }
        }
        return result;
    }
}