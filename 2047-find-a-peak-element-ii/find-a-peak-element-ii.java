class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int[]arr=new int[2];
        int n=mat.length,m=mat[0].length;
        if(n==1&&m==1)return arr;
        else if(n==1){
            int max=0;
            for(int i=0;i<m;i++){
                if(max<mat[0][i]){
                    max=mat[0][i];
                    arr[1]=i;
                }
            }
            return arr;
        }
        else if(m==1){
            int max=0;
            for(int i=0;i<n;i++){
                if(max<mat[i][0]){
                    max=mat[i][0];
                    arr[0]=i;
                }
            }
            return arr;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0&&j==0){
                    if(mat[i][j]>mat[i+1][j]&&mat[i][j]>mat[i][j+1]){
                        return new int[]{i,j};
                    }
                }
                else if(i==n-1&&j==m-1){
                    if(mat[i][j]>mat[i-1][j]&&mat[i][j]>mat[i][j-1]){
                        return new int[]{i,j};
                    }
                }
                else if(i==0&&j==m-1){
                    if(mat[i][j]>mat[i+1][j]&&mat[i][j]>mat[i][j-1]){
                        return new int[]{i,j};
                    }
                }
                else if(i==n-1&&j==0){
                    if(mat[i][j]>mat[i-1][j]&&mat[i][j]>mat[i][j+1]){
                        return new int[]{i,j};
                    }
                }
                else if(i==0){
                    if(mat[i][j]>mat[i][j+1]&&mat[i][j]>mat[i][j-1]&&mat[i][j]>mat[i+1][j]){
                        return new int[]{i,j};
                    }
                }
                else if(i==n-1){
                    if(mat[i][j]>mat[i][j-1] && mat[i][j]>mat[i][j+1] && mat[i][j]>mat[i-1][j]){
                        return new int[]{i,j};
                    }
                }
                else if(j==0){
                    if(mat[i][j]>mat[i-1][j]&&mat[i][j]>mat[i+1][j]&&mat[i][j]>mat[i][j+1]){
                        return new int[]{i,j};
                    }
                }
                else if(j==m-1){
                    if(mat[i][j]>mat[i-1][j] && mat[i][j]>mat[i+1][j] && mat[i][j]>mat[i][j-1]){
                        return new int[]{i,j};
                    }
                }
                else{
                    if(mat[i][j]>mat[i-1][j]&&mat[i][j]>mat[i+1][j]&&mat[i][j]>mat[i][j-1]&&mat[i][j]>mat[i][j+1]){
                        return new int[]{i,j};
                    }
                }
            }
        }
        return arr;
    }
}