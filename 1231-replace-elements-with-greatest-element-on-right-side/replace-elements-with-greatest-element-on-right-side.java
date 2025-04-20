class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int max=-1,cur=0;
        for(int i=n-1;i>=0;i--){
            cur=arr[i];
            arr[i]=max;
            if(cur>max){
                max=cur;
            }
        }
        return arr;
    }
}