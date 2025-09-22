class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer>m=new HashMap<>();
        for(int i:nums)m.put(i,m.getOrDefault(i,0)+1);
        int max=0;
        for(int i:nums){
            if(m.get(i)>max)max=m.get(i);
        }
        int count=0;
        for(Map.Entry<Integer,Integer>mp:m.entrySet()){
            if(mp.getValue()==max)count+=max;
        }
        return count;
    }
}