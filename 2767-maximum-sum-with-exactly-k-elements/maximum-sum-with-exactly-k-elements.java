class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max=0;
        for(int i:nums){
            if(max<i)max=i;
        }
        int result=0;
        for(int i=0;i<k;i++){
            result+=max;
            max++;
        }
        return result;
    }
}