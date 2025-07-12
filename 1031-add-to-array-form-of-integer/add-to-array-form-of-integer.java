import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer>l=new ArrayList<>();
        String str="";
        for(int i:num){
            str+=i;
        }
        BigInteger bi=new BigInteger(str);
        bi=bi.add(BigInteger.valueOf(k));
        str=bi+"";
        for(int i=0;i<str.length();i++){
            l.add(Integer.valueOf(str.charAt(i)+""));
        }
        return l;
    }
}