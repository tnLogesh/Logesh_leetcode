class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int n=s.length();
        boolean[]alpha=new boolean[26];
        for(int i=0;i<n-1;i++){
            char f=s.charAt(i);
            for(int j=i+1;j<n;j++){
                char l=s.charAt(j);
                if(!alpha[f-'a']&&f==l){
                    alpha[f-'a']=true;
                    if(distance[f-'a']!=j-i-1)return false;
                }
            }
        }
        return true;
    }
}