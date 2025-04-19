class Solution {
    public int[] arrayRankTransform(int[] nums) {
        int n=nums.length;
        int[]arr=Arrays.copyOf(nums,n);
        Arrays.sort(arr);
        Map<Integer,Integer>m=new HashMap<>();
        int rank=1;
        for(int i=0;i<n;i++){
            if(!m.containsKey(arr[i])){
                m.put(arr[i],rank++);
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=m.get(nums[i]);
        }
        return arr;
    }
}