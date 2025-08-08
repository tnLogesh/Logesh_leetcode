class Solution {
    public int subsetXORSum(int[] nums) {
        int n=nums.length;
        int total=0;
        List<List<Integer>>l=new ArrayList<>();
        generateSubsets(0,nums,new ArrayList<>(),l);
        for(List<Integer>list:l){
            int sum=0;
            for(int i:list){
                sum^=i;
            }
            total+=sum;
        }
        return total;
    }
    static void generateSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            generateSubsets(i + 1, nums, current, result);
            current.remove(current.size() - 1);
        }
    }
}