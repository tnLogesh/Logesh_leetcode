class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String>set=new HashSet<>();
        int total=1<<k;
        for(int i=0;i<=s.length()-k;i++){
            String binary=s.substring(i,i+k);
            set.add(binary);
            if(set.size()==total)return true;
        }
        return set.size()==total;
    }
}