class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int[]arr=new int[n];
        int a=0;
        for(int i:nums){
            if(i!=0)arr[a++]=i;
        }
        System.arraycopy(arr, 0, nums, 0, n);
    }
}