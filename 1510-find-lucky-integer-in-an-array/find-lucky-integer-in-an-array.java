class Solution {
    public int findLucky(int[] arr) {
        int n=arr.length;
        int res=-1;
        Map<Integer,Integer>m=new HashMap<>();
        for(int i:arr){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer>mp:m.entrySet()){
            if(mp.getValue()==mp.getKey())res=mp.getValue();
        }
        return res;
    }
}