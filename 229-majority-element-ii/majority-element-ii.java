class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>l=new ArrayList<>();
        int n=nums.length;
        int t=n/3;
        Set<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        for(int i:set){int c=0;
            for(int j:nums){
                if(i==j)c++;
            }
            if(c>t)l.add(i);
        }
        return l;
    }
}