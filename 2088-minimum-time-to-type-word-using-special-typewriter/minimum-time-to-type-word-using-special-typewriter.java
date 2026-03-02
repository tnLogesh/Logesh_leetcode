class Solution {
    public int minTimeToType(String word) {
        int result=0;
        char first='a';
        for(char ch:word.toCharArray()){
            int diff=Math.abs(first-ch);
            result+=Math.min(diff,26-diff);
            result++;
            first=ch;
        }
        return result;
    }
}