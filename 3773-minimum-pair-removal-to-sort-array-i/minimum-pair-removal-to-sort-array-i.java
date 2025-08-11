class Solution {
    static boolean isSorted(List<Integer>arr){
        int c=0;
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)>arr.get(i+1))return false;
        }
        return true;
    }
    public int minimumPairRemoval(int[] nums) {
        int oper=0;
        List<Integer>l=new ArrayList<>();
        for(int i:nums){
            l.add(i);
        }
        while(!isSorted(l)){
            int minSum = Integer.MAX_VALUE;
            int idx = -1;
            for (int i = 0; i < l.size() - 1; i++) {
                int sum = l.get(i) + l.get(i + 1);
                if (sum < minSum) {
                    minSum = sum;
                    idx = i;
                }
            }
            l.set(idx, minSum);
            l.remove(idx + 1);
            oper++;
        }
        return oper;
    }
}