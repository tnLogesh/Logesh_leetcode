class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1)return s;
        List<List<Character>>l=new ArrayList<>();
        for(int i=0;i<numRows;i++)l.add(new ArrayList<Character>());
        int c=0;
        boolean gd=true;
        for(int i=0;i<s.length();i++){
            l.get(c).add(s.charAt(i));
            if(c==0)gd=true;
            else if(c==numRows-1)gd=false;
            c+=gd?1:-1;
        }
        StringBuilder str=new StringBuilder();
        for(List<Character>i:l){
            for(char ch:i)str.append(ch);
        }
        return str.toString();
    }
}