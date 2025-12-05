class Solution {
    public int minimumChairs(String s) {
        int chair=0;
        int max=0;
        for(char i:s.toCharArray()){
            if(i=='E'){
                chair++;
                if(max<chair)max=chair;
            }
            else chair--;
        }
        return max;
    }
}