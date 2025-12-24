class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int total=0;
        for(int i:apple)total+=i;
        int n=capacity.length;
        int sum=0;
        for(int i=n-1;i>=0;i--){
            sum+=capacity[i];
            if(total<=sum)return n-i;
        }
        return 0;
    }
}