class Solution {
    public int pivotInteger(int n) {
        int leftSum=0;
        for(int i=1;i<=n;i++)leftSum+=i;
        int rightSum=0;
        for(int i=n;i>0;i--){
            rightSum+=i;
            //System.out.println(leftSum+" "+rightSum);
            if(leftSum==rightSum)return i;
            leftSum-=i;
        }
        return -1;
    }
}