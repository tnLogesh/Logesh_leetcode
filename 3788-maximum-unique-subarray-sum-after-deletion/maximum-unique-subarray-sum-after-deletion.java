class Solution {
    public int maxSum(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        List<Integer>l=new ArrayList<>();
        int sum=0;
        for(int i:set){
            l.add(i);
        }
        Collections.sort(l);
        for(int i:l){
            if(i>0)sum+=i;
        }
        if(sum==0)sum+=l.get(l.size()-1);
        return sum;
    }
}