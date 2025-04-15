class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int sr=0;
        int er=matrix.length-1;
        int sc=0;
        int ec=matrix[0].length-1;
        while(sr<=er&&sc<=ec){
            if(matrix[sr][ec]==target)return true;
            else if(matrix[sr][ec]>target)ec--;
            else sr++;
        }
        return false;
    }
}