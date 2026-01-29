class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer>r=new ArrayList<>();
        List<Integer>c=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<m;j++){
                min=Math.min(matrix[i][j],min);
            }
            r.add(min);
        }
        for(int i=0;i<m;i++){
            int max=0;
            for(int j=0;j<n;j++){
                max=Math.max(matrix[j][i],max);
            }
            c.add(max);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==r.get(i)&&matrix[i][j]==c.get(j))l.add(matrix[i][j]);
            }
        }
        return l;
    }
}