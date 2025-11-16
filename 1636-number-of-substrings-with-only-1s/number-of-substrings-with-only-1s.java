class Solution {
    public int numSub(String s) {
        long count=0;
        long result=0;
        int mod=1000000007;
        for(char i:s.toCharArray()){
            if(i=='1')count++;
            else{
                result=(result+(count*(count+1)/2))%mod;
                count=0;
            }
        }
        result=(result+(count*(count+1)/2))%mod;
        return (int)result;
    }
}