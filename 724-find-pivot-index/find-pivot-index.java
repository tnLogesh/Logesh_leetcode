class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[]sumLeft=nums.clone();
        int[]sumRight=nums.clone();
        for(int i=1;i<n;i++){
            sumLeft[i]+=sumLeft[i-1];
        }
        System.out.println();
        for(int i=n-2;i>=0;i--){
            sumRight[i]+=sumRight[i+1];
        }
        for(int i=0;i<n;i++){
            if(sumLeft[i]==sumRight[i])return i;
        }
        return -1;
    }
}