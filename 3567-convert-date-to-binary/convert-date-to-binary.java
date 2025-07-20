class Solution {
    public String convertDateToBinary(String date) {
        String[]arr=date.split("-");
        String str="";
        for(String i:arr){
            int a=Integer.parseInt(i);
            str+=Integer.toBinaryString(a);
            str+="-";
        }
        return str.substring(0,str.length()-1);
    }
}