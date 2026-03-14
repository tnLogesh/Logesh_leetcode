class Solution {
    public void generate(List<Integer>current,int[]nums,List<List<Integer>>l,int ind){
        if(!l.contains(new ArrayList(current)))l.add(new ArrayList(current));
        for(int i=ind;i<nums.length;i++){
            
            current.add(nums[i]);
            generate(current,nums,l,i+1);
            current.remove(current.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>l=new ArrayList<>();
        Arrays.sort(nums);
        generate(new ArrayList<Integer>(),nums,l,0);
        return l;
    }
}