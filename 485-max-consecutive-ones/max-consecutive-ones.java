class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=Integer.MIN_VALUE;
        int c=0;
        for(int i:nums){
            if(i==1)c++;
            if(i==0)c=0;
            if(c>max)max=c;
        }
        return max;
    }
}