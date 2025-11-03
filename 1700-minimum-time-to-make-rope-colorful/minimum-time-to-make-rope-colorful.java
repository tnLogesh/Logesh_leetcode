class Solution {
    public int minCost(String colors, int[] neededTime) {
        int minimumTime=0;
        int n=neededTime.length;
        for(int i=1;i<n;i++){
            if(colors.charAt(i)==colors.charAt(i-1)){
                minimumTime+=Math.min(neededTime[i],neededTime[i-1]);
                neededTime[i]=Math.max(neededTime[i],neededTime[i-1]);
            }
        }
        return minimumTime;
    }
}