import java.math.*;
class Solution {
    public String addStrings(String num1, String num2) {
        String str="";
        BigInteger b1=new BigInteger(num1);
        BigInteger b2=new BigInteger(num2);
        return b1.add(b2)+"";
    }
}