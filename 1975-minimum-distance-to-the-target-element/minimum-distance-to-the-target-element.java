class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int result=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                int min=Math.abs(i-start);
                if(result>min)result=min;
            }
        }
        return result;
    }
}