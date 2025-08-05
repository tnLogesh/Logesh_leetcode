class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int moves=0;
        for(int i=0;i<n;i++){
            if(i>moves)return false;
            if(moves<i+nums[i])moves=i+nums[i];
        }
        return true;
    }
}