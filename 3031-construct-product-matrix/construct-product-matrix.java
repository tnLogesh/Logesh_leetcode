class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int p1=1,p2=1;
        int[]arr=new int[n*m];
        int[]res=new int[n*m];
        int ind=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[ind++]=grid[i][j]%12345;
            }
        }
        for(int i=0;i<n*m;i++){
            res[i]=p1;
            p1=(p1*arr[i])%12345;
        }
        for(int i=n*m-1;i>=0;i--){
            res[i]=(p2*res[i])%12345;
            p2=(p2*arr[i])%12345;
        }
        ind=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                grid[i][j]=res[ind++];
            }
        }
        return grid;
    }
}