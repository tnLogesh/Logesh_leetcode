class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        StringBuilder sb=new  StringBuilder(x+"");
        String str=sb.toString();
        sb.reverse();
        return str.equals(sb.toString());
    }
}