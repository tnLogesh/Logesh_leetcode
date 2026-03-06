class Solution {
    public boolean checkOnesSegment(String s) {
        char[]arr=s.toCharArray();
        int n=arr.length;
        if(n==1&&arr[0]=='1')return true;
        else if(n==1&&arr[0]=='0')return false;
        for(int i=0;i<n-1;i++){
            if(arr[i]=='0'&&arr[i+1]=='1')return false;
        }
        return true;
    }
}