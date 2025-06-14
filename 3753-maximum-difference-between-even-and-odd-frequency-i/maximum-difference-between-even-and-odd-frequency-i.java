class Solution {
    public int maxDifference(String s) {
        int[]freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int even=Integer.MAX_VALUE;
        int odd=0;
        for(int i=0;i<26;i++){
            if(freq[i]%2==0){
                if(even>freq[i]&&freq[i]!=0){
                    even=freq[i];
                }
            }
            else{
                odd=Math.max(odd,freq[i]);
            }
        }
        System.out.println(even+" "+odd);
        return odd-even;
    }
}