class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        if(k==1)return true;
        int n=nums.size();
        for (int i = 0; i + 2 * k <= n; i++) {
            if (isIncreasing(i, i + k - 1, nums) && isIncreasing(i + k, i + 2 * k - 1, nums)) {
                return true;
            }
        }
        return false;
    }
    boolean isIncreasing(int a,int b,List<Integer>l){
        for(int i=a;i<b;i++){
            if(l.get(i)>=l.get(i+1))return false;
        }
        return true;
    }
}