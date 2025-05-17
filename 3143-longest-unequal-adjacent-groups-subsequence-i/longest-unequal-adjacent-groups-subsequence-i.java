class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String>l=new ArrayList<>();
        int n=words.length;
        int last=-1;
        for(int i=0;i<n;i++){
            if(groups[i]!=last){
                l.add(words[i]);
                last=groups[i];
            }
        }
        return l;
    }
}