class Solution {
    public String capitalizeTitle(String title) {
        String str="";
        String[]arr=title.split(" ");
        for(String i:arr){
            if(i.length()<=2)str+=i.toLowerCase();
            else{
                str+=Character.toUpperCase(i.charAt(0));
                for(int j=1;j<i.length();j++){
                    str+=Character.toLowerCase(i.charAt(j));
                }
            }
            str+=" ";
        }
        return str.trim();
    }
}