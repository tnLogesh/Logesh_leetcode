class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String>l=new ArrayList<>();
        //Set<Character>set=new HashSet<>();
        for(int i=0;i<words.length;i++){
            Map<Character,Integer>m1=new HashMap<>();
            Map<Character,Integer>m2=new HashMap<>();
            String word=words[i];
            boolean b=true;
            for(int j=0;j<word.length();j++){
                char c=word.charAt(j);
                char p=pattern.charAt(j);
                if(!m1.containsKey(c))m1.put(c,j);
                if(!m2.containsKey(p))m2.put(p,j);
                if(!m1.get(c).equals(m2.get(p))){
                    b=false;
                    break;
                }
            }
            if(b)l.add(word);
        }
        return l;
    }
}