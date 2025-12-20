class Solution {
    public int minDeletionSize(String[] strs) {
        int n=strs[0].length();
        int len=strs.length;
        int result=0;
        for(int i=0;i<n;i++){
            char[]arr1=new char[len];
            for(int j=0;j<len;j++){
                arr1[j]=strs[j].charAt(i);
            }
            char[]arr=Arrays.copyOf(arr1,len);
            Arrays.sort(arr);
            if(!Arrays.equals(arr1,arr))result++;
        }
        return result;
    }
}