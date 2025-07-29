class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        List<Integer>ls=new ArrayList<>();
        List<Integer>rs=new ArrayList<>();
        int i=0;
        int j=n-1;
        int l=0;
        int r=0;
        while(i<n&&j>=0){
            ls.add(l);
            l+=nums[i];
            rs.add(r);
            r+=nums[j];
            i++;
            j--;
        }
        for(i=0;i<n;i++){
            nums[i]=Math.abs(ls.get(i)-rs.get(n-i-1));
        }
        return nums;
    }
}