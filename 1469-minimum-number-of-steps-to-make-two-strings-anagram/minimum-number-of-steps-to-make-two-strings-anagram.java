class Solution {
    public int minSteps(String s, String t) {
        int c=0;
        int n=s.length();
        int[]freq=new int[26];
        char[]arr1=s.toCharArray();
        char[]arr2=t.toCharArray();
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        // for(char i:arr2){
        //     freq[i-'a']--;
        // }
        for(int i:freq){
            if(i>0)c+=i;
        }
        return c;
    }
}