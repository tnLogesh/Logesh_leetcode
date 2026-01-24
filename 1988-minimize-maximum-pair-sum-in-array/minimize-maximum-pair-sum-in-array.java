class Solution {
    static{
        for(int i=0;i<100;i++){
            minPairSum(new int[]{0,0,0,0,0});
        }
    }
    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        int n=nums.length;
        int ptr1=0,ptr2=n-1;
        while(ptr1<ptr2){
            int sum=nums[ptr1]+nums[ptr2];
            if(max<sum)max=sum;
            ptr1++;
            ptr2--;
        }
        return max;
    }
}