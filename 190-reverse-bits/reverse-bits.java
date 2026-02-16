class Solution {
    public int reverseBits(int n) {
        StringBuilder sb=new StringBuilder(Integer.toString(n,2));
        sb.reverse();
        for(int i=sb.length();i<32;i++)sb.append("0");
        System.out.print(sb);
        return Integer.parseInt(sb.toString(),2);
    }
}