import java.math.*;

class Solution {
    public int numSteps(String s) {
        BigInteger num = new BigInteger(s, 2);
        int result = 0;
        while (num.compareTo(BigInteger.ONE) > 0) {
            result++;
            if (num.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
                num = num.divide(BigInteger.TWO);
            } else {
                num = num.add(BigInteger.ONE);
            }
        }
        return result;
    }
}