class Solution {
    public String reversePrefix(String s, int k) {
        if(k==1)return s;
        StringBuilder sb=new StringBuilder(s.substring(0,k));
        sb.reverse();
        return sb.toString()+s.substring(k);
    }
}