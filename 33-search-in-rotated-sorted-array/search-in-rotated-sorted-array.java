class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                return i;
            }
            // if(nums[n-i-1]==target){
            //     return n-i-1;
            // }
        }
        return -1;
    }
}