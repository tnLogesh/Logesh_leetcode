class Solution {
    public int maxDepth(String s) {
        int max=0;
        int c=0;
        for(char i:s.toCharArray()){
            if(i=='(')c++;
            else if(i==')')c--;
            max=Math.max(c,max);
        }
        return max;
    }
}