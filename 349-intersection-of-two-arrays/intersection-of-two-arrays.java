class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>s1=new HashSet<>();
        for(int i:nums1){
            for(int j:nums2){
                if(i==j)s1.add(i);
            }
        }
        int[]arr=new int[s1.size()];
        int a=0;
        for(int i:s1){
            arr[a]=i;a++;
        }
        return arr;
    }
}