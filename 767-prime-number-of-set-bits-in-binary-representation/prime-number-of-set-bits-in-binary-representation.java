class Solution {
    public int countPrimeSetBits(int left, int right) {
        int result=0;
        List<Integer>l=new ArrayList<>();
        l.add(2);
        l.add(3);l.add(5);l.add(7);l.add(11);l.add(13);l.add(17);l.add(19);
        for(int i=left;i<=right;i++){
            int num=Integer.bitCount(i);
            if(l.contains(num))result++;
        }
        return result;
    }
}