class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer,Integer>m=new HashMap<>();
        int result=0;
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        for(int i:m.keySet()){
            if(m.get(i)%k==0){
                result+=i*m.get(i);
            }
        }
        return result;
    }
}