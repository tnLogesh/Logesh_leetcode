class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int n=nums.length;
        int q=queries.length;
        int mod=1000000007;
        for(int i=0;i<q;i++){
            int l=queries[i][0];
            int r=queries[i][1];
            int k=queries[i][2];
            int v=queries[i][3];
            int idx=l;
            while(idx<=r){
                nums[idx]=(int)((1L*nums[idx]*v)%mod);
                idx+=k;
            }
        }
        int result=0;
        for(int i=0;i<n;i++){
            result^=nums[i];
        }
        return result;
    }
}