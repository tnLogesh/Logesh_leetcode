class Solution {
    public boolean isBalanced(String num) {
        int oddSum=0,evenSum=0;
        int n=num.length();
        for(int i=0;i<n;i++){
            if(i%2==0){
                evenSum+=num.charAt(i)-'0';
            }
            else oddSum+=num.charAt(i)-'0';
        }
        return oddSum==evenSum;
    }
}