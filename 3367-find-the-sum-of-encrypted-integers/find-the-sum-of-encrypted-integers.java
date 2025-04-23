class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        // if(nums[0]<10){
        //     for(int i:nums)sum+=i;
        // return sum;
        // }
        for(int i:nums){
            int len=(int)Math.log10(i);
            int max=0;
            while(i>0){
                int rem=i%10;
                if(max<rem)max=rem;
                i/=10;
            }
            int s=0;
            for(int k=0;k<=len;k++){
                s=s*10+max;
            }
            sum+=s;
        }
        return sum;
    }
}