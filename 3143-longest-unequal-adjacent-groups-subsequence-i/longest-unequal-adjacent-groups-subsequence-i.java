class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String>l=new ArrayList<>();
        int n=groups.length;
        l.add(words[0]);
        for(int i=1;i<n;i++){
            if(groups[i]!=groups[i-1])l.add(words[i]);
        }
        return l;
    }
}