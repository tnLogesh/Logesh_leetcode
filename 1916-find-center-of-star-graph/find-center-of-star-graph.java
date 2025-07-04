class Solution {
    public int findCenter(int[][] edges) {
        int center=0;
        int n=edges.length;
        int fv1=edges[0][0];
        int fv2=edges[0][1];
        int sv1=edges[1][0];
        int sv2=edges[1][1];
        if(fv1==sv1||fv1==sv2)return fv1;
        return fv2;
    }
}