class Solution {
    public int countPairs(int[] nums, int k) {
        int c=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    if((i*j)%k==0)c++;
                }
            }
        }
        return c;
    }
}