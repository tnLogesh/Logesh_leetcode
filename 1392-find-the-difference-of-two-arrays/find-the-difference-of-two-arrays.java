class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>>l=new ArrayList<>();
        l.add(new ArrayList<>());
        l.add(new ArrayList<>());
        int n1=nums1.length;
        int n2=nums2.length;
        og:
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(nums1[i]==nums2[j]){
                    continue og;
                }
            }
            if(!l.get(0).contains(nums1[i]))l.get(0).add(nums1[i]);
            
        }
        og:
        for(int i=0;i<n2;i++){
            for(int j=0;j<n1;j++){
                if(nums2[i]==nums1[j]){
                    continue og;
                }
            }
            if(!l.get(1).contains(nums2[i]))l.get(1).add(nums2[i]);
            
        }
        return l;
    }
}