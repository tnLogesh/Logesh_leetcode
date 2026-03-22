class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        if(Arrays.deepEquals(mat,target))return true;
        for(int a=0;a<3;a++){
            int n=mat.length;
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
            for (int i = 0; i < n; i++) {
                int left = 0, right = n - 1;
                while (left < right) {
                    int temp = mat[i][left];
                    mat[i][left] = mat[i][right];
                    mat[i][right] = temp;
                    left++;
                    right--;
                }
            }
            if(Arrays.deepEquals(mat,target))return true;
        }
        return false;
    }
}