class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String i:operations){
            if(i.charAt(0)=='-'||i.charAt(2)=='-')x--;
            else x++;
        }
        return x;
    }
}