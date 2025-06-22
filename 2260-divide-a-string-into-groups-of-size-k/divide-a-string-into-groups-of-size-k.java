class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n=s.length();
        while(n%k!=0){
            s+=fill;
            n=s.length();
        }
        //System.out.println(s);
        String[] arr=new String[n/k];
        int a=0;
        for(int i=0;i<n;i+=k){
            arr[a++]=s.substring(i,i+k);
        }
        return arr;
    }
}