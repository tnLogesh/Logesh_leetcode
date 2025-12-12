class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            int num=0;
            while(i>0){
                int rem=i%10;
                num+=rem;
                i/=10;
            }
            if(num==1)return num;
            else if(num<min)min=num;
        }
        return min;
    }
}