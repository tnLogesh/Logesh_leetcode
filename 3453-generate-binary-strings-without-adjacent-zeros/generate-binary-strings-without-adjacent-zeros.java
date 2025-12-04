class Solution {
    List<String>l=new ArrayList<>();
    public List<String> validStrings(int n) {
        helper(n,"");
        return l;
    }
    public void helper(int n,String str){
        if(str.length()==n){
            l.add(str);
            return;
        }
        helper(n,str+"1");
        if(str.length()==0||str.charAt(str.length()-1)!='0'){
            helper(n,str+"0");
        }
    }
}