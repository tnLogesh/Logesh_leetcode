class Solution {
    public int subarraySum(int[] nums) {
        int result=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int start=Math.max(0,i-nums[i]);
            result+=subarray(nums,start,i);
        }
        return result;
    }
    public int subarray(int[]arr,int start,int end){
        int sum=0;
        for(int i=start;i<=end;i++){
            sum+=arr[i];
        }
        return sum;
    }
}