class Solution {
    public int countValidSelections(int[] nums) {
        int n=nums.length;
        int result=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                if(right(nums,i))result++;
                if(left(nums,i))result++;
            }
        }
        return result;
    }
    private boolean right(int[] nums,int curr){
            int[]arr=nums.clone();
            curr++;
            int direction=1;
            while(curr>=0&&curr<nums.length){
                if (arr[curr]>0) {
                arr[curr]--;
                direction*=-1; // reverse direction
            }
            curr+=direction;
            }
            for(int i:arr){
                if(i>0)return false;
            }
            return true;
    }
    private boolean left(int[] nums,int curr){
        int[]arr=nums.clone();
        curr--;
        int direction=-1;
            while(curr>=0&&curr<nums.length){
                if (arr[curr] > 0) {
                arr[curr]--;
                direction*=-1; // reverse direction
            }
            curr += direction;
            }
            for(int i:arr){
                if(i>0)return false;
            }
            return true;
    }
}