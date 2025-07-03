class Solution {
    public char kthCharacter(int k) {
        String str="a";
        while(str.length()<=k){
            String temp="";
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='z')temp+='a';
                else{
                    temp+=(char)(str.charAt(i)+1);
                }
            }
            str+=temp;
            if(str.length()>k)return str.charAt(k-1);
        }
        
        return str.charAt(k-1);
    }
}