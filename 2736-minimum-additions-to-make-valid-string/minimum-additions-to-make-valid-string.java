class Solution {
    public int addMinimum(String word) {
        int sum=0;
        int n=word.length();
        if(n==1)return 2;
        if(word.charAt(0)=='b')sum++;
        else if(word.charAt(0)=='c')sum+=2;
        for(int i=0;i<n-1;i++){
            char ch1=word.charAt(i);
            char ch2=word.charAt(i+1);
            if(ch1-ch2==0){
                sum+=2;
            }
            else if(ch1-ch2==1||ch1-ch2==-2){
                sum+=1;
            }
        }
        if(word.charAt(n-1)=='b')sum++;
        else if(word.charAt(n-1)=='a')sum+=2;
        return sum;
    }
}