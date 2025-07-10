class Solution {
    static boolean isPalin(int n,int i){
        String str=Integer.toString(n,i);
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
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<n-1;i++){
            if(!isPalin(n,i)){
                return false;
            }
        }
        return true;
    }
}