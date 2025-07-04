class Solution {
    static void dfs(int[][]arr,int city,boolean[]barr){
        barr[city]=true;
        for(int i=0;i<arr.length;i++){
            if(arr[city][i]==1&&!barr[i]){
                dfs(arr,i,barr);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int provinces=0;
        int n=isConnected.length;
        boolean[]visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(isConnected,i,visited);
                provinces++;
            }
        }
        return provinces;
    }
}