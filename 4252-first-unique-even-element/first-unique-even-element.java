class Solution {
    public int firstUniqueEven(int[] nums) {
        Map<Integer,Integer>m=new LinkedHashMap<>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        for(int i:m.keySet()){
            if(i%2==0&&m.get(i)==1)return i;
        }
        return -1;
    }
}