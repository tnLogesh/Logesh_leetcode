class Solution {
    public int[] sortByBits(int[] arr) {
        Map<Integer,List<Integer>>m=new TreeMap<>();
        for(int i:arr){
            int count=Integer.bitCount(i);
            List<Integer>l=m.getOrDefault(count,new ArrayList<>());
            l.add(i);
            m.put(count,l);
        }
        int ind=0;
        for(int i:m.keySet()){
            Collections.sort(m.get(i));
            for(int j:m.get(i))arr[ind++]=j;
        }
        return arr;
    }
    public int countOf1(String num){
        int count=0;
        for(char i:num.toCharArray()){
            if(i=='1')count++;
        }
        return count;
    }
}