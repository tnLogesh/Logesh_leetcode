class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long sum=0;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum+=grid[i][j];
            }
        }
        if(sum%2!=0)return false;
        long hsum=0;
        long target=sum/2;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<m;j++){
                hsum+=grid[i][j];
            }
            if(hsum==target)return true;
        }
        long vsum=0;
        for(int i=0;i<m-1;i++){
            for(int j=0;j<n;j++){
                vsum+=grid[j][i];
            }
            if(vsum==target)return true;
        }
        return false;
    }
}