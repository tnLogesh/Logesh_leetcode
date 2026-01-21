class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n=nums.size();
        int[]result=new int[n];
        int ind=0;
        io:
        for(int i:nums){
            if(i%2==0){
                result[ind++]=-1;
                continue;
            }
            int temp=i;
            int ones=0;
            while((temp&1)==1){
                ones++;
                temp>>=1;
            }
            result[ind++]=i-(1<<(ones-1));
        }
        return result;
    }
}