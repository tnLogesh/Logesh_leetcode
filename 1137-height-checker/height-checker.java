class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int[]arr=heights.clone();
        Arrays.sort(arr);
        int c=0;
        int i=0;
        while(i<n){
            if(arr[i]!=heights[i])c++;
            i++;
        }
        return c;
    }
}