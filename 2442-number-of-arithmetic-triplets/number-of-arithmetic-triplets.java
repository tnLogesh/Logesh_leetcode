class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n-1;j++){
                if(nums[j]-nums[i]==diff){
                for(int k=j+1;k<n;k++){
                    if(nums[k]-nums[j]==diff)count++;
                }
                }
            }
        }
        return count;
    }
}