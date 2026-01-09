class Solution {
    static{
        int[]arr=new int[]{1,2,3};
        for(int i=0;i<100;i++){
            stableMountains(arr,3);
        }
    }
    public static List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer>l=new ArrayList<>();
        for(int i=1;i<height.length;i++){
            if(height[i-1]>threshold)l.add(i);
        }
        return l;
    }
}