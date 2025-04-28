class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        int ptr1=0;
        int ptr2=n-1;
        while(ptr1<ptr2){
            char ch=s[ptr1];
            s[ptr1]=s[ptr2];
            s[ptr2]=ch;
            ptr1++;
            ptr2--;
        }
    }
}