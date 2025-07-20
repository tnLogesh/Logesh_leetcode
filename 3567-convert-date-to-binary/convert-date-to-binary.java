class Solution {
    public String convertDateToBinary(String date) {
        String[]arr=date.split("-");
        String str="";
        for(int i=0;i<arr.length;i++){
            int a=Integer.parseInt(arr[i]);
            str+=Integer.toBinaryString(a);
            if(i!=arr.length-1)str+="-";
        }
        return str;
    }
}