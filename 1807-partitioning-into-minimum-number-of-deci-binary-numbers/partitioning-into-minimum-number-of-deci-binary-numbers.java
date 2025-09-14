class Solution {
    public int minPartitions(String n) {
        int num=0;
        for(char i:n.toCharArray()){
            int val=i-'0';
            if(num<val)num=val;
        }
        return num;
    }
}