class Solution {
    public int[] numberOfPairs(int[] nums) {
        Map<Integer,Integer>m=new HashMap<>();
        for(int i:nums)m.put(i,m.getOrDefault(i,0)+1);
        int[]res=new int[2];
        for(Map.Entry<Integer,Integer>mp:m.entrySet()){
            res[0]+=mp.getValue()/2;
            res[1]+=mp.getValue()%2;
        }
        return res;
    }
}