class Solution {
    public int countBinarySubstrings(String s) {
        List<Integer>l=new ArrayList<>();
        int count=1;
        int n=s.length();
        for(int i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1))count++;
            else{
                l.add(count);
                count=1;
            }
        }
        l.add(count);
        int result=0;
        n=l.size();
        for(int i=1;i<n;i++){
            result+=Math.min(l.get(i),l.get(i-1));
        }
        return result;
    }
}