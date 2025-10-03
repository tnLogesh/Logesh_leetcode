class Solution {
    public int[] countBits(int n) {
        int[]arr=new int[n+1];
        for(int i=1;i<=n;i++){
            String str=Integer.toBinaryString(i);
            int c=0;
            for(char j:str.toCharArray()){
                if(j=='1')c++;
            }
            arr[i]=c;
        }
        return arr;
    }
}