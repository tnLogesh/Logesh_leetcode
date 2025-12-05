class Solution {
    public int countPrimes(int n) {
        if(n<=2)return 0;
        boolean[]sieve=new boolean[n];
        Arrays.fill(sieve,true);
        int result=0;
        for(int i=2;i<n;i++){
            if(sieve[i]){
                result++;
                for(int j=i+i;j<n;j+=i)sieve[j]=false;
            }
        }
        return result;
    }
}