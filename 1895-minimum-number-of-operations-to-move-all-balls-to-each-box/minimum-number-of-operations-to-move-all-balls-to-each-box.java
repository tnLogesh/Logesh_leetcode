class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(boxes.charAt(i)=='1'){
                l.add(i);
            }
        }
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            for(int j:l){
                if(j!=i)arr[i]+=Math.abs(j-i);
            }
        }
        return arr;
    }
}