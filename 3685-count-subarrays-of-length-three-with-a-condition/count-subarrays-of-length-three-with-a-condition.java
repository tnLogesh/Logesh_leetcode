class Solution {
    public int countSubarrays(int[] nums) {
        int n=nums.length;
        int len=0;
        for(int i=0;i<n-2;i++){
            if((nums[i]+nums[i+2])*2==(nums[i+1]))len++;
            System.out.println(nums[i]+nums[i+2]+" "+nums[i+1]/2.0);
        }
        return len;
    }
}