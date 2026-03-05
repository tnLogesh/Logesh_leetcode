class Solution {
    public int minOperations(String s) {
        int minWays=Integer.MAX_VALUE;
        int one=0;
        int zero=0;
        char[]arr=s.toCharArray();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(i%2==0&&arr[i]=='1'){
                zero++;
            }
            else if(i%2!=0&&arr[i]=='0')zero++;
        }
        arr=s.toCharArray();
        for(int i=0;i<n;i++){
            if(i%2==0&&arr[i]=='0')one++;
            else if(i%2!=0&&arr[i]=='1')one++;
        }
        minWays=Math.min(one,zero);
        return minWays;
    }
}