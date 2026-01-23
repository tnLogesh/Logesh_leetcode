class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int fill=capacity;
        int n=plants.length;
        int steps=0;
        for(int i=-1;i<n-1;i++){
            if(plants[i+1]<=fill){
                fill-=plants[i+1];
                steps++;
            }
            else{
                steps+=(i+1)*2;
                fill=capacity;
                i--;
            }
        }
        return steps;
    }
}