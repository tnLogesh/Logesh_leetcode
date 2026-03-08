class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int len=nums.length;
        String str="";
        for(int i=0;i<len;i++){
            str+=(nums[i].charAt(i)=='0'?"1":"0");
        }
        return str;
    }
}