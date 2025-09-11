class Solution {
    public String sortVowels(String s){
        List<Character>l=new ArrayList<>();
        String str="aeiouAEIOU";
        for(char i:s.toCharArray()){
            if(str.contains(i+"")){
                l.add(i);
            }
        }
        Collections.sort(l);
        s=s.replaceAll("[AEIOUaeiou]","*");
        str="";
        int a=0;
        for(char i:s.toCharArray()){
            if(i=='*'){
                str+=l.get(a++);
            }
            else str+=i;
        }
        return str;
    }
}