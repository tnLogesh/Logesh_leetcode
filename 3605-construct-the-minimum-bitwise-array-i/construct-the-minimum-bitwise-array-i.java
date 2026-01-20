class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n=nums.size();
        int[]result=new int[n];
        int ind=0;
        io:
        for(int i:nums){
            for(int j=0;j<i;j++){
                if((j|(j+1))==i){
                    result[ind++]=j;
                    continue io;
                }
            }
            result[ind++]=-1;
        }
        return result;
    }
}