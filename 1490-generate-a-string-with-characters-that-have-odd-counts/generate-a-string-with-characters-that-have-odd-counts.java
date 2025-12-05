class Solution {
    public String generateTheString(int n) {
       String str="";
       if(n%2==0){
        str+="a".repeat(n-1);
        str+="b";
       }
       else str+="a".repeat(n);
       return str; 
    }
}