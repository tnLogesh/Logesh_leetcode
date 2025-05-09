class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n-1;j++){
                if(Math.abs(nums[i]-nums[j])==diff){
                for(int k=j+1;k<n;k++){
                    if(Math.abs(nums[j]-nums[k])==diff)count++;
                }
                }
            }
        }
        return count;
    }
}