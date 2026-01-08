class Solution {
    // static{
    //     int[]arr=new int[]{1,2,3,4,5};
    //     for(int i=0;i<100;i++)subarraySum(arr,2);
    // }
    public static int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int result=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum==k)result++;
            }
        }
        return result;
    }
}