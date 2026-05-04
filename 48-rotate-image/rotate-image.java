class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(i!=j){
                    int temp=matrix[j][i];
                    matrix[j][i]=matrix[i][j];
                    matrix[i][j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            int ptr1=0;
            int ptr2=n-1;
            while(ptr1<ptr2){
                int temp=matrix[i][ptr1];
                matrix[i][ptr1]=matrix[i][ptr2];
                matrix[i][ptr2]=temp;
                ptr1++;
                ptr2--;
            }
        }
    }
}