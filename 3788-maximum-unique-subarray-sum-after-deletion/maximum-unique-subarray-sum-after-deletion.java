class Solution {
    public int maxSum(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i:set){
            if(i>0)sum+=i;
            if(max<i)max=i;
        }
        if(sum==0)sum=max;
        return sum;
    }
}