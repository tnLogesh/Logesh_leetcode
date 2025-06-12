class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        if(Math.abs(nums[0]-nums[n-1])>max){
            max=Math.abs(nums[0]-nums[n-1]);
        }
        for(int i=1;i<n;i++){
            int m=Math.abs(nums[i-1]-nums[i]);
            if(max<m)max=m;
        }
        
        return max;
    }
}