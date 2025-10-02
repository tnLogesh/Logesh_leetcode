class Solution {
    public int maxBottlesDrunk(int n, int m) {
        int result=n;
        int empty=n;
        while(empty>=m){
            empty-=m;
            result++;
            empty++;
            m++;
        }
        return result; 
    }
}