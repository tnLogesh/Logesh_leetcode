class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int count=0;
        int n=words.length;
        int[]arr=new int[n];
        int ind=0;
        for(int i=0;i<n;i++){
            if(words[i].equals(target)){
                count++;
                arr[ind++]=i;
            }
        }
        if(count==0)return -1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<count;i++){
            int dist=Math.abs(arr[i]-startIndex);
            int diff=Math.min(dist,n-dist);
            min=Math.min(diff,min);
        }
        return min;
    }
}