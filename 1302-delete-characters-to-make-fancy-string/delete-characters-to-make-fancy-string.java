class Solution {
    public String makeFancyString(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        int f=0;
        if(n==1)return s;
        for(int i=0;i<n;i++){
            if(i!=0&&s.charAt(i)==s.charAt(i-1)){
                f++;
            }
            else f=1;
            if(f<=2)sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}