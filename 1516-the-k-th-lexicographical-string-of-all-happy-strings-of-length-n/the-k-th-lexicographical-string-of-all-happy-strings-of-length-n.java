class Solution {
    public void generate(String current,int n,List<String>l){
        if(current.length()==n){
            l.add(current);
            return;
        }
        char[]arr={'a','b','c'};
        for(char ch:arr){
            if(current.length()==0||current.charAt(current.length()-1)!=ch){
                generate(current+ch,n,l);
            }
        }
    }
    public String getHappyString(int n, int k) {
        List<String>l=new ArrayList<>();
        generate("",n,l);
        Collections.sort(l);
        return l.size()<k?"":l.get(k-1);
    }
}