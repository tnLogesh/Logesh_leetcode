class Solution {
    public String reverseWords(String s) {
        String str="";
        String[]arr=s.split(" ");
        int n=arr.length;
        for(int i=0;i<n;i++){
            int len=arr[i].length();
            for(int j=len-1;j>=0;j--){
                str+=arr[i].charAt(j);
            }
            str+=" ";
        }
        return str.trim();
    }
}