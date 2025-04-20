class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            int le=0;
            for(int j=i+1;j<n;j++){
                if(le<arr[j])le=arr[j];
            }
            arr[i]=le;
        }
        arr[n-1]=-1;
        return arr;
    }
}