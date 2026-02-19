class Solution {
    public boolean hasAlternatingBits(int num) {
        String str=Integer.toBinaryString(num);
        char[]arr=str.toCharArray();
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i-1]==arr[i])return false;
        }
        return true;
    }
}