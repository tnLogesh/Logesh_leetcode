class Solution {
    public int countOdds(int low, int high) {
        int range=high-low+1;
        return (range+low%2)/2;
    }
}