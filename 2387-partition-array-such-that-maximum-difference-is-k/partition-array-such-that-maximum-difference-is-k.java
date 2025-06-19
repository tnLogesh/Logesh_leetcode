class Solution {
    public int partitionArray(int[] nums, int k) {
        int res=1;
        int n=nums.length;
        Arrays.sort(nums);
        int min=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]-min>k){
                res++;
                min=nums[i];
            }
        }
        return res;
    }
}