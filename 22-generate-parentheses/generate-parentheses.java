class Solution {
    public void generate(String current,int n,List<String>l,int open,int close){
        if(current.length()==2*n){
            l.add(current);
            return;
        }
        if(open<n){
            generate(current+"(",n,l,open+1,close);
        }
        if(close<open){
            generate(current+")",n,l,open,close+1);
        }

    }
    public List<String> generateParenthesis(int n) {
        List<String>l=new ArrayList<>();
        generate("",n,l,0,0);
        return l;
    }
}