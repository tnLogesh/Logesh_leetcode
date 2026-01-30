class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String,Integer>m=new HashMap<>();
        for(List<String>i:paths){
            m.put(i.get(0),m.getOrDefault(i.get(0),0)+1);
            m.put(i.get(1),m.getOrDefault(i.get(1),0)+1);
        }
        List<String>l=new ArrayList<>();
        for(String i:m.keySet()){
            if(m.get(i)==1)l.add(i);
        }
        for(List<String>i:paths){
            if(l.contains(i.get(1)))return i.get(1);
        }
        return "";
    }
}