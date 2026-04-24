class Solution {
    static{
        for(int i=0;i<100;i++){
            furthestDistanceFromOrigin(" ");
        }
    }
    public static int furthestDistanceFromOrigin(String moves) {
        int L=0;
        int R=0;
        int UnderScore=0;
        for(char ch:moves.toCharArray()){
            if(ch=='L')L++;
            else if(ch=='R')R++;
            else UnderScore++;
        }
        return Math.abs(L-R)+UnderScore;
    }
}