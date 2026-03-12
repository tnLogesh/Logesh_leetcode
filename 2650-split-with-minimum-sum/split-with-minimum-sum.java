class Solution {
    public int splitNum(int num) {
        char[]arr=new char[(int)Math.log10(num)+1];
        int n=num;
        int ind=0;
        while(n>0){
            arr[ind++]=(char)((n%10)+'0');
            n/=10;
        }
        Arrays.sort(arr);
        int sum1=0;
        int sum2=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0)sum1=sum1*10+(arr[i]-'0');
            else sum2=sum2*10+(arr[i]-'0');
        }
        return sum1+sum2;
    }
}