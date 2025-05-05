class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[]arr=new int[n];
        int a=1;
        int b=0;
        for(int i:nums){
            if(i>0){
                arr[b]=i;b+=2;
            }
            else{
                arr[a]=i;a+=2;
            }
        }
        return arr;
    }
}