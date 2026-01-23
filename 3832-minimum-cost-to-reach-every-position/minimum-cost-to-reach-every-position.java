class Solution {
    public int[] minCosts(int[] cost) {
        int n=cost.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(cost[i]<min){
                min=cost[i];
            }
            else cost[i]=min;
        }
        return cost;
    }
}