class Solution {
    public boolean isBalanced(String num) {
        int oddSum=0,evenSum=0;
        int n=num.length();
        for(int i=0;i<n;i++){
            int digit=num.charAt(i)-'0';
            if(i%2==0){
                evenSum+=digit;
            }
            else oddSum+=digit;
        }
        return oddSum==evenSum;
    }
}