class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer>l=new ArrayList<>();
        int n1=nums1.length;
        int n2=nums2.length;
        if(n1<n2){
            for(int i=0;i<n1;i++){
                for(int j=0;j<n2;j++){
                    if(nums1[i]==nums2[j]){l.add(nums1[i]);nums2[j]=-1;break;}
                }
            }
        }
        else{
            for(int i=0;i<n2;i++){
                for(int j=0;j<n1;j++){
                    if(nums2[i]==nums1[j]){l.add(nums2[i]);nums1[j]=-1;break;}
                }
            }
        }
        int[]arr=new int[l.size()];
        int a=0;
        for(int i:l){
            arr[a]=i;
            a++;
        }
        return arr;
    }
}