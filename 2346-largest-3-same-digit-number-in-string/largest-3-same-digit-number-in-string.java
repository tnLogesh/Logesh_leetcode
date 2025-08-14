class Solution {
    public String largestGoodInteger(String num) {
        int window=3;
        int n=num.length();
        char max='0';
        int c=0;
        for(int i=0;i<=n-window;i++){
            if(num.charAt(i)==num.charAt(i+1)&&num.charAt(i)==num.charAt(i+2)){
                //if(i==0)max=num.charAt(i);
                if(num.charAt(i)>max)max=num.charAt(i);
                c++;
            }
        }
        String max1=max+"";
        if(c==0)return "";
        return max1+max1+max1;
    }
}