class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String>l=new ArrayList<>();
        for(String i:queries){
            for(String j:dictionary){
                int diff=0;
                for(int ind=0;ind<j.length();ind++){
                    if(i.charAt(ind)!=j.charAt(ind))diff++;
                    if(diff>2)break;
                }
                if(diff<=2){
                    l.add(i);
                    break;
                }
            }
        }
        return l;
    }
}