class Solution {
    boolean size;
    public int[] plusOne(int[] digits) {
        int len=digits.length;
        if(len==1){
            if(digits[0]!=9){
                digits[0]+=1;
                return digits;
            }
        }
        for(int i:digits){
            if(i<9){
                size=true;
                break;
            }
        }
        if(!size){
            int[] arr=new int[len+1];
            arr[0]=1;
            return arr;
        }
        for(int i=len-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]+=1;
                return digits;
            }
            digits[i]=0;
        }
        return digits;
    }
}