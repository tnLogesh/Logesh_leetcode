class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int arr[]=new int[k];
        int n=nums.length;
        Map<Integer,Integer>m=new HashMap<>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        for(int i=0;i<k;i++){
            int maxv=0;
            int maxk=0;
            for(int j:m.keySet()){
            if(m.get(j)>maxv){
                maxv=m.get(j);
                maxk=j;
            }
        }
        arr[i]=maxk;
        m.remove(maxk);
        }
        return arr;
    }
}