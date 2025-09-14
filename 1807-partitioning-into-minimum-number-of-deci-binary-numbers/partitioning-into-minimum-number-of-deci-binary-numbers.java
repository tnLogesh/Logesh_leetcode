class Solution {
    public int minPartitions(String n) {
        int num=0;
        for(char i:n.toCharArray()){
            int val=Integer.parseInt(i+"");
            if(num<val)num=val;
        }
        return num;
    }
}