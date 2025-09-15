class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int n=text.length();
        int c=0;
        String[]arr=text.split(" ");
        io:
        for(String i:arr){
            int a=0;
            for(char ch:brokenLetters.toCharArray()){
                String abc=ch+"";
                if(i.contains(abc)){
                    a++;
                    break;
                }
            }
            if(a==0)c++;
        }
        return c;
    }
}