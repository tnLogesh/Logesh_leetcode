class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<Integer>l=new ArrayList<>();
        int start=nums[0];
        int end=nums[n-1];
        Set<Integer>s=new HashSet<>();
        for(int i:nums)s.add(i);
        for(int i=start+1;i<end;i++){
            if(!s.contains(i))l.add(i);
        }
        return l;
    }
}