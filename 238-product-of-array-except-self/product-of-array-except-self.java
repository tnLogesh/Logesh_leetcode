class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[]arr=new int[nums.length];
        int p1=1;
        for(int i=0;i<nums.length;i++){
            arr[i]=p1;
            //System.out.print(arr[i]+" ");
            p1*=nums[i];
            //System.out.print(p1+" ");
        }
        System.out.println();
        int p2=1;
        for(int i=nums.length-1;i>=0;i--){
            //System.out.print(arr[i]+" * "+p2+" ");
            arr[i]*=p2;
            
            p2*=nums[i];
            //System.out.print(p2+" ");
        }
        return arr;
    }
}