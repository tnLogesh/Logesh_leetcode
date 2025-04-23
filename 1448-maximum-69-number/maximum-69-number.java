class Solution {
    public int maximum69Number (int num) {
        StringBuilder sb=new StringBuilder();
        while(num>0){
            sb.append(num%10);
            num/=10;
        }
        sb.reverse();
        int n=0;
        int c=0;
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='6'&&c==0){n=n*10+(int)'9'-'0';c++;continue;}
            n=n*10+(int)sb.charAt(i)-'0';
        }
        return n;
    }
}