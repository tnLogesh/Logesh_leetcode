class Solution {
    public boolean validMountainArray(int[] arr) {
        //int[]num=arr.clone();
        //Arrays.sort(num);
        int len=arr.length;
        if(len<3){
            return false;
        }
        int atl1=0;
        int atl2=0;
        int j=0;
        for(int i=0;i<len-1;i++){
            if(arr[i]<arr[i+1]){  //0<3 
                atl1++;
                j++;
                continue;
            }
            break;
        }
        for(int k=j;k<len-1;k++){
            if(arr[k]>arr[k+1]){  //0<3 
                atl2++;
            }
        }
        if(atl1>0&&atl2>0&&atl1+atl2==len-1){
            return true;
        }
        return false;
    }
}