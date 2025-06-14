class Solution {
    static boolean isValidPalindrome(String str){
        int ptr1=0;
        int ptr2=str.length()-1;
        while(ptr1<ptr2){
            if(str.charAt(ptr1)!=str.charAt(ptr2)){
                return false;
            }
            ptr1++;
            ptr2--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        String res="";
        for(int i=0;i<n;i++){
            String str="";
            for(int j=i;j<n;j++){
                str=s.substring(i,j+1);
                // if(j==n-1){
                //     str=s.substring(i,j+1);
                // }
                if(isValidPalindrome(str)){
                    if(str.length()>res.length()){
                        res=str;
                    }
                }
            }
        }
        return res;
    }
}