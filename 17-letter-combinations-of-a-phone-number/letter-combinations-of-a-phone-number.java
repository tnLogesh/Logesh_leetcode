class Solution {
    public char[][]arr={
        {'a','b','c'},
        {'d','e','f'},
        {'g','h','i'},
        {'j','k','l'},
        {'m','n','o'},
        {'p','q','r','s'},
        {'t','u','v'},
        {'w','x','y','z'}};
    public List<String> letterCombinations(String digits) {
        List<String>l=new ArrayList<>();
        solve(digits,0,"",l);
        return l;
    }
    void solve(String digits,int ind,String current,List<String>l){
        if(ind==digits.length()){
            l.add(current);
            return;
        }
        int num=digits.charAt(ind)-'2';
        for(char ch:arr[num]){
            solve(digits,ind+1,current+ch,l);
        }
    }
}