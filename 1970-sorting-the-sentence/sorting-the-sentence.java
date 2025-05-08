class Solution {
    public String sortSentence(String s) {
        String[]arr=s.split(" ");
        int n=arr.length;
        Arrays.sort(arr,(a,b)->{
            int x=a.charAt(a.length()-1)-'0';
            int y=b.charAt(b.length()-1)-'0';
            return Integer.compare(x,y);
        });
        StringBuilder sb=new StringBuilder();
        for(String i:arr){
            sb.append(i.substring(0,i.length()-1)).append(" ");
        }
        return sb.toString().trim();
    }
}