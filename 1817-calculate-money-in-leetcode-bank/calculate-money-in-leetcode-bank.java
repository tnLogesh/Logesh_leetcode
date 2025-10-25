class Solution {
    public int totalMoney(int n) {
        int monday=0;
        int money=0;
        for(int i=1;i<=n;i++){
            if((i-1)%7==0){
                monday++;
            }
            money+=monday+(i-1)%7;
        }
        return money;
    }//123456789101112131415161718192021222324252627282930
}