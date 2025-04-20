class Solution {
    public int thirdMax(int[] arr) {
        Set<Integer>set=new TreeSet<>();
        for(int i:arr){
            set.add(i);
        }
        int a=0;
        int[]nums=new int[set.size()];
        for(int i:set){
            nums[a]=i;a++;
        }
        int n=nums.length;
        if(n==3)return nums[n-3];
        if(n<3)return nums[n-1];
        return nums[n-3];
    }
}