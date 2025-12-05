class Solution {
    public String makeSmallestPalindrome(String s) {
        char[]arr=s.toCharArray();
        int n=arr.length-1;
        for(int i=0;i<=n/2;i++){
            if(arr[i]!=arr[n-i]){
                if(arr[i]>arr[n-i])arr[i]=arr[n-i];
                else arr[n-i]=arr[i];
            }
        }
        return new String(arr);
    }
}