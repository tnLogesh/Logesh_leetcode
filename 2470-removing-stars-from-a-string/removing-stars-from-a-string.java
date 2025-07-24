class Solution {
    static{
        for(int i=0;i<200;i++){
            removeStars("");
        }
    }
    public static String removeStars(String s) {
        StringBuilder sb=new StringBuilder();
        int ind=-1;
        for(int i=0;i<s.length();i++){
            if(!sb.isEmpty()&&s.charAt(i)=='*'){
                sb.deleteCharAt(ind);
                ind--;
                continue;
            }
            sb.append(s.charAt(i));
            ind++;
        }
        return sb.toString();
    }
}