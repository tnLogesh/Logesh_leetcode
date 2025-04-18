class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double num=0d;
        int n1=nums1.length;
        int n2=nums2.length;
        double[]nums=new double[n1+n2];
        int a=0;
        for(int i:nums1){
            nums[a]=i;a++;
        }
        for(int i:nums2){
            nums[a]=i;a++;
        }
        Arrays.sort(nums);
        for(double i:nums){
            System.out.print(i+" ");
        }
        if(nums.length%2==0){
            num=(nums[(nums.length/2)]+nums[((nums.length/2)-1)])/2;
        }
        else{
            num=nums[(nums.length/2)];
        }
        return num;
    }
}