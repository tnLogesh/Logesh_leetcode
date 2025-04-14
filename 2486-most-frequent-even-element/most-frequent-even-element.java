class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        int num=-1;
        int n=nums.length;
        Set<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        for(int i:set){
            if(i%2==0){
                int c=0;
            for(int j:nums){
                if(i==j)c++;
            }
            if(c==max){
                num=Math.min(num,i);
            }
            else if(c>max){
                max=c;
                num=i;
            }
            }
        }
        return num;
    }
}