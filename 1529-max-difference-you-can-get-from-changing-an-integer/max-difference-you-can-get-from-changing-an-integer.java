class Solution {
    static boolean isPalin(int num){
        int n=num;
        int a=0;
        while(n>0){
            int rem=n%10;
            a=a*10+rem;
            n/=10;
        }
        return a==num;
    }
    public int maxDiff(int num) {
        String str=num+"";
        String max="";
        String min="";
        char ch='9';
        int n=str.length();
        for(int i=0;i<n;i++){
            if(str.charAt(i)<'9'){
                ch=str.charAt(i);
                break;
            }
            else if(str.charAt(i)=='9'){
                ch='9';
            }
        }
        for(int i=0;i<n;i++){
            if(str.charAt(i)==ch){
                max+='9';
            }
            else{
                max+=str.charAt(i);
            }
        }
        if(str.charAt(0)>'1'){
            ch=str.charAt(0);
            for(int i=0;i<n;i++){
                if(ch==str.charAt(i)){
                    min+='1';
                }
                else{
                    min+=str.charAt(i);
                }
            }
        }
        else if(isPalin(num)){
            min=num+"";
        }
        else{
            min+=str.charAt(0);
            for(int i=1;i<n;i++){
                if(str.charAt(i)>'0'&&str.charAt(i)!=str.charAt(0)){
                    ch=str.charAt(i);
                    break;
                }
            }
            for(int i=1;i<n;i++){
                if(ch==str.charAt(i)){
                    min+='0';
                }
                else{
                    min+=str.charAt(i);
                }
            }
        }
        return Integer.valueOf(max)-Integer.valueOf(min);
    }
}