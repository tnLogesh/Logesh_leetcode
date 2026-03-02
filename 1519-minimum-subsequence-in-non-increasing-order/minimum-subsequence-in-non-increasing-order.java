class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        List<Integer>l=new ArrayList<>();
        int tsum=0;
        for(int i:nums)tsum+=i;
        int sum=0;
        for(int i=nums.length-1;i>=0;i--){
            tsum-=nums[i];
            sum+=nums[i];
            l.add(nums[i]);
            if(sum>tsum)break;
        }
        return l;
    }
}