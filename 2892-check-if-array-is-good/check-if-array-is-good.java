class Solution {
    public boolean isGood(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int max=nums[n-1];
        for(int i=0;i<n-2;i++){
            if(nums[i]==nums[i+1]){
                return false;
            }
        }
        if(nums[n-1]<n)return true;
        return false;
    }
}