class Solution {
    public int numberOfSpecialChars(String word) {
        int n=word.length();
        Set<Character>set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(word.charAt(i));
        }
        int c=0;
        for(char i:set){
            if(Character.isLowerCase(i)){
                int count=0;
                for(int j:set){
                    if(Character.isUpperCase(j)){
                        if(i-'a'==j-'A')count++;
                    }
                }
                if(count!=0)c++;
            }
        }
        return c;
    }
}