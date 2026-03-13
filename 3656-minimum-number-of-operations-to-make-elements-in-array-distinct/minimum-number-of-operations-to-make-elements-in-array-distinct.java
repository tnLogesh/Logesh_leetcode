class Solution {
    public boolean check(int[]arr,int ind,int n){
        Set<Integer>s=new HashSet<>();
        for(int i=ind;i<n;i++)s.add(arr[i]);
        return n-ind==s.size();
    }
    public int minimumOperations(int[] nums) {
        int count=0,n=nums.length;
        for(int i=0;i<n;i+=3){
            if(check(nums,i,n)){
                return count;
            }
            count++;
        }
        return count;
    }
}