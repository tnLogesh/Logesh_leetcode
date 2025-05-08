class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length;
        int[]arr=new int[n];
        List<Integer>el=new ArrayList<>();
        List<Integer>ol=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i%2==0){
                el.add(nums[i]);
            }
            else{
                ol.add(nums[i]);
            }
        }
        Collections.sort(el);
        Collections.sort(ol,Collections.reverseOrder());
        int j=0;
        for(int i=0;i<n/2;i++){
            arr[j++]=el.get(i);
            arr[j++]=ol.get(i);
        }
        if(n%2!=0){
            arr[n-1]=el.get(n/2);
        }
        return arr;
    }
}