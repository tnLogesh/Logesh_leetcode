class Solution {
    public int countCollisions(String directions) {
        int n=directions.length(),i=0,j=n-1;
        while(i<n&&directions.charAt(i)=='L')i++;
        while(j>=0&&directions.charAt(j)=='R')j--;
        int collision=0;
        for(int a=i;a<=j;a++){
            if(directions.charAt(a)!='S')collision++;
        }
        return collision;
    }
}