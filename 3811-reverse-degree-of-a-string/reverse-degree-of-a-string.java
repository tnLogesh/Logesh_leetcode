class Solution {
    public int reverseDegree(String s) {
        int reverseDegree=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            int value='z'-s.charAt(i)+1;
            reverseDegree+=value*(i+1);
        }
        return reverseDegree;
    }
}