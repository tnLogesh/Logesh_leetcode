class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int result=0;
        for(int i:nums){
            if(i%2==0){
                result|=i;
            }
        }
        return result;
    }
}