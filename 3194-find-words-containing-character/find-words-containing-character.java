class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer>l=new ArrayList<>();
        int len=words.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<words[i].length();j++){
                if(words[i].charAt(j)==x) {l.add(i);break;}
            }
        }
        return l;
    }
}