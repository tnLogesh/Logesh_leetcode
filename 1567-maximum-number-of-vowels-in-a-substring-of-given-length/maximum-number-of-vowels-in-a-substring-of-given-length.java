class Solution {
    static boolean isVow(char i){
        // return "aeiou".indexOf(i)!=-1;
        return i=='a'||i=='e'||i=='i'||i=='o'||i=='u';
    }
    public int maxVowels(String s, int k) {
        char[]arr=s.toCharArray();
        int n=arr.length;
        int max=0;
        int cur=0;
        for(int i=0;i<n;i++){
            if(isVow(arr[i])){
                cur++;
            }
            if(i>=k){
                if(isVow(arr[i-k])){
                    cur--;
                }
            }
            if(cur>max)max=cur;
        }
        return max;
    }
}