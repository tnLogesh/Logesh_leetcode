class Solution {
    public String reversePrefix(String word, char ch) {
        String res=""+ch;
        if(word.contains(res)){
            StringBuilder sb=new StringBuilder();
        String a="";
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                sb.append(word.substring(0,i+1));
                a=word.substring(i+1);
                break;
            }
        }
        String str=sb.reverse().toString();
        str+=a;
        return str;
        }
        return word;
    }
}