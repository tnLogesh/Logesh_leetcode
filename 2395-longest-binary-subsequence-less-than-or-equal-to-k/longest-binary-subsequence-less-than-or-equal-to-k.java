class Solution {
    public int longestSubsequence(String s, int k) {
        int len=s.length();
        int n=Integer.toBinaryString(k).length();
        if(len<=n){
            return len;
        }
        int a=Integer.parseInt(s.substring(len-n,len),2);
        //System.out.print(a+" ");
        int c=a<=k?n:n-1;
        for(int i=0;i<len-n;i++){
            if(s.charAt(i)=='0')c++;
        }
        return c;
    }
}