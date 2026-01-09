class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int result=0,n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>=k)return i;
        }
        return 0;
    }
}