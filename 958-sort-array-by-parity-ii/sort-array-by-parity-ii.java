class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int a=0;
        int n=nums.length;
        int[]arr=new int[n];
        int b=1;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){arr[a]=nums[i];a+=2;}
            else {arr[b]=nums[i];b+=2;}
        }
        return arr;
    }
}