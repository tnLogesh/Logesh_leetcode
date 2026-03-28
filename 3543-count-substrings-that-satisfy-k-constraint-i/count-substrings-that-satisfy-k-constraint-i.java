class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int n=s.length();
        int count=1;
        for(int i=0;i<n-1;i++){
            for(int j=i;j<n;j++){
                String str=s.substring(i,j+1);
                if(check(str,k))count++;
            }
        }
        return count;
    }
    public boolean check(String str,int k){
        int ocount=0;
        int zcount=0;
        for(char i:str.toCharArray()){
            if(i=='0')zcount++;
            else ocount++;
        }
        return zcount<=k||ocount<=k;
    }
}