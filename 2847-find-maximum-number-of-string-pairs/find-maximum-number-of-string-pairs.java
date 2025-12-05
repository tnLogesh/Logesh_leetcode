class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int result=0;
        int n=words.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                StringBuilder sb=new StringBuilder(words[j]);
                sb.reverse();
                if(words[i].equals(sb.toString())){
                    result++;
                    break;
                }
            }
        }
        return result;
    }
}