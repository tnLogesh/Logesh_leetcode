class Solution {
    public boolean isCircularSentence(String sentence) {
        String[]arr=sentence.trim().split("\\s+");
        int n=arr.length;
        if(arr.length==1){
            return arr[0].charAt(0)==arr[0].charAt(arr[0].length()-1);
        }
        if(arr[0].charAt(0)!=arr[n-1].charAt(arr[n-1].length()-1))return false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i].charAt(arr[i].length()-1)!=arr[i+1].charAt(0))return false;
        }
        return true;
    }
}