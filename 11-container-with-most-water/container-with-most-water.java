class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int ptr1=0 , ptr2=n-1;
        int max=0;
        while(ptr1<ptr2){
            int min=Math.min(height[ptr1],height[ptr2])*Math.abs(ptr1-ptr2);
            max=Math.max(max,min);
            if(height[ptr1]<height[ptr2]){
                ptr1++;
            }
            else{
                ptr2--;
            }
        }
        return max;
    }
}