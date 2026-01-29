class Solution {
    public int[] decrypt(int[] code, int k) {
        if(k==0){
            Arrays.fill(code,0);
            return code;
        }
        int n=code.length;
        int[]arr=new int[n];
        if(k>0){
            for(int i=0;i<n;i++){
                for(int j=i+1;j<i+k+1;j++){
                    arr[i]+=code[j%n];
                }
            }
        }
        else{
            for(int i=0;i<n;i++){
                for(int j=i-1;j>i-1+k;j--){
                    arr[i]+=code[((j%n)+n)%n];
                }
            }
        }
        return arr;
    }
}