class Solution {
    public int countAsterisks(String s) {
        int count=0;
        int n=s.length();
        int line=0;
        for(char i:s.toCharArray()){
            if(i=='|'&&line==0)line++;
            else if(i=='*'&&line==0)count++;
            else if(i=='|'&&line==1)line--;
        }
        return count;
    }
}