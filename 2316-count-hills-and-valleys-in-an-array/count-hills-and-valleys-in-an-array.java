class Solution {
    public int countHillValley(int[] nums) {
        int n=nums.length;
        int horv=0;
        for(int i=0;i<n-2;i++){
            if(nums[i+1]>nums[i]&&nums[i+1]>nums[i+2]){
                horv++;
                //System.out.print(nums[i+1]+" ");
            }
            else if(nums[i+1]<nums[i]&&nums[i+1]<nums[i+2]){
                horv++;
                //System.out.print(nums[i+1]+" ");
            }
            else{
                for(int j=i+1;j<n;j++){
                    if(nums[i+1]!=nums[j]){
                        if(nums[i+1]>nums[i]&&nums[i+1]>nums[j]){
                            horv++;
                            //System.out.print(nums[i+1]+" ");
                        }
                        else if(nums[i+1]<nums[i]&&nums[i+1]<nums[j]){
                            horv++;
                            //System.out.print(nums[i+1]+" ");
                        }
                        break;
                    }
                }
            }
        }
        return horv;
    }
}