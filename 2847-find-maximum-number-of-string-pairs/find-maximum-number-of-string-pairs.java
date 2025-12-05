class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int result=0;
        int n=words.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(words[i].charAt(0)==words[j].charAt(1)){
                    if(words[i].charAt(1)==words[j].charAt(0)){
                        result++;
                        break;
                    }
                }
            }
        }
        return result;
    }
}