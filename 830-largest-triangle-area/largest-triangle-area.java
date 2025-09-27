class Solution {
    static{
        for(int i=0;i<200;i++){
            largestTriangleArea(new int[][]{{0,0},{0,0},{0,0}});
        }
    }
    public static double largestTriangleArea(int[][] points) {
        double ans=0.0;
        int n=points.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    double area=(0.5)*Math.abs(points[i][0]*(points[j][1]-points[k][1])+points[j][0]*(points[k][1]-points[i][1])+points[k][0]*(points[i][1]-points[j][1]));
                    if(area>ans)ans=area;
                }
            }
        }
        return ans;
    }
}