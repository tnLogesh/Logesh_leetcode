class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n=nums.length;
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]==key){
                for(int j=0;j<n;j++){
                    if(Math.abs(j-i)<=k)l.add(j);
                }
            }
        }
        Set<Integer>set=new HashSet<>();
        for(int i:l){
            set.add(i);
        }
        l.clear();
        for(int i:set){
            l.add(i);
        }
        Collections.sort(l);
        return l;
    }
}