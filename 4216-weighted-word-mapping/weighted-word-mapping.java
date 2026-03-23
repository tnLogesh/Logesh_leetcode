class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int n=words.length;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            int sum=0;
            for(char ch:words[i].toCharArray()){
                sum+=weights[ch-'a'];
            }
            sum%=26;
            char ch=(char)(sum+'a');
            sb.append((char)('z'-ch+'a'));
        }
        return sb.toString();
    }
}