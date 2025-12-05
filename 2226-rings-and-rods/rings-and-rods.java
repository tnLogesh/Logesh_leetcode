class Solution {
    public int countPoints(String rings) {
        Map<Integer,Set<Character>>m=new HashMap<>();
        int n=rings.length();
        for(int i=0;i<10;i++){
            Set<Character>set=new HashSet<>();
            m.put(i,set);
        }
        for(int i=0;i<n-1;i+=2){
            int pos=rings.charAt(i+1)-'0';
            char color=rings.charAt(i);
            m.get(pos).add(color);
        }
        int result=0;
        for(Map.Entry<Integer,Set<Character>>mp:m.entrySet()){
            if(mp.getValue().size()==3)result++;
        }
        return result;
    }
}