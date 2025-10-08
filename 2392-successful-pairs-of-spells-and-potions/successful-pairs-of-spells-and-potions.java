class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n=spells.length;
        int m=potions.length;
        int[]arr=new int[n];
        Arrays.sort(potions);
        for(int i=0;i<n;i++){
            long currentSpell=spells[i];
            int low=0,high=m-1;
            int c=0;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(currentSpell*potions[mid]>=success){
                    c=(m-mid);
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            arr[i]=c;
        }
        return arr;
    }
}