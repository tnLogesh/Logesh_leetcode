class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int result=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if((j-i+1)%2==1)result+=sum;
            }
        }
        return result;
    }
}