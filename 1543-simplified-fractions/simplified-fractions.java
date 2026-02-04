class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String>l=new ArrayList<>();
        for(int i=1;i<n;i++){
            for(int j=i+1;j<=n;j++){
                if(gcd(i,j)==1){
                    l.add(i+"/"+j);
                }
            }
        }
        return l;
    }
    int gcd(int i,int j){
        if(j==0)return i;
        return gcd(j,i%j);
    }
}