class Solution {
    public String greatestLetter(String s) {
        int n=s.length();
        Set<Character>set=new TreeSet<>();
        for(int i=0;i<n;i++){
            set.add(s.charAt(i));
        }
        char[]arr=new char[set.size()];
        int o=0;
        for(char i:set){
            arr[o++]=i;
        }
        for(int i=set.size()-1;i>=0;i--){
            for(char j:set){
                if(arr[i]-'A'==j-'a')return arr[i]+"";
            }
        }
        return ""; 
    }
}