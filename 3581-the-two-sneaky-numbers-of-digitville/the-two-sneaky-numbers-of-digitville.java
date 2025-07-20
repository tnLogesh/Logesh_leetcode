class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer,Integer>m=new HashMap<>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        int[]arr=new int[2];
        int i=0;
        for(Map.Entry<Integer,Integer>mp:m.entrySet()){
            if(mp.getValue()==2){
                arr[i++]=mp.getKey();
            }
        }
        return arr;
    }
}