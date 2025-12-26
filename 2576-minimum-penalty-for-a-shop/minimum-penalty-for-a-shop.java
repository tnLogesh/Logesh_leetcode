class Solution {
    public int bestClosingTime(String customers) {
        char[]arr=customers.toCharArray();
        int total1=0;
        for(char i:arr){
            if(i=='Y')total1++;
        }
        int result=total1;
        int hour=0;
        int ans=0;
        for(char i:arr){
            hour++;
            if(i=='N')total1++;
            else total1--;
            if(result>total1){
                result=total1;
                ans=hour;
            }
        }
        return ans;
    }
}