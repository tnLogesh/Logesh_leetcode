class Solution {
    public String reverseByType(String s) {
        char[]arr=s.toCharArray();
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]>='a'&&arr[i]<='z'&&arr[j]>='a'&&arr[j]<='z'){
                char ch=arr[i];
                arr[i]=arr[j];
                arr[j]=ch;
                i++;
                j--;
            }
            else if(arr[i]>='a'&&arr[i]<='z')j--;
            else i++;
        }
        i=0;
        j=arr.length-1;
        while(i<j){
            if(!(arr[i]>='a'&&arr[i]<='z')&&!(arr[j]>='a'&&arr[j]<='z')){
                char ch=arr[i];
                arr[i]=arr[j];
                arr[j]=ch;
                i++;
                j--;
            }
            else if(!(arr[i]>='a'&&arr[i]<='z'))j--;
            else i++;
        }
        return new String(arr);
    }
}