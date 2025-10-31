class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int n=groupSizes.length;
        Map<Integer,List<Integer>>m=new HashMap<>();
        for(int i=0;i<n;i++){
            int num=groupSizes[i];
            if(m.containsKey(num))m.get(num).add(i);
            else{
                List<Integer>l=new ArrayList<>();
                l.add(i);
                m.put(num,l);
            }
        }
        List<List<Integer>>l=new ArrayList<>();
        for(Map.Entry<Integer,List<Integer>>mp:m.entrySet()){
            for(int i=0;i<mp.getValue().size();i+=mp.getKey()){
                List<Integer>l1=new ArrayList<>();
                for(int j=i;j<i+mp.getKey();j++){
                    l1.add(mp.getValue().get(j));
                }
                l.add(l1);
            }
        }
        return l;
    }
}