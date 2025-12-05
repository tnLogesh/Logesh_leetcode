class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int result=0;
        for(String i:patterns){
            if(word.contains(i))result++;
        }
        return result;
    }
}