class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>l=new ArrayList<>();
        Map<String,List<String>>m=new HashMap<>();
        for(String i:strs){
            char[]arr=i.toCharArray();
            Arrays.sort(arr);
            String s=new String(arr);
            if(m.containsKey(s)){
                m.get(s).add(i);
            }
            else{
                List<String> newList = new ArrayList<>();
                newList.add(i);
                m.put(s, newList);
            }
        }
        l.addAll(m.values());
        return l;
    }
}