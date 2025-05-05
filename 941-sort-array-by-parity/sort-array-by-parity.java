class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int[]arr=new int[n];
        int a=0;
        for(int i:nums){
            if(i%2==0){
                arr[a++]=i;
            }
        }
        for(int i:nums){
            if(i%2!=0)arr[a++]=i;
        }
        return arr;
    }
}