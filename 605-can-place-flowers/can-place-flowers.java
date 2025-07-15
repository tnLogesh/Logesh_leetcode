class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        int len=f.length;
        for(int i=0;i<len&&n>0;i++){
            if(f[i]==0){
                boolean emptyLeft=(i==0)||(f[i-1]==0);
                boolean emptyRight=(i==len-1)||(f[i+1]==0);
                if(emptyLeft&&emptyRight){
                    f[i]=1;
                    n--;
                }
            }
        }
        return n<=0;
    }
}