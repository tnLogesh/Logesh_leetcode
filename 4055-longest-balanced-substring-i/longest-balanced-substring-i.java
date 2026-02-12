class Solution {
    public int longestBalanced(String s) {
        int result = 0;
        int n = s.length();
        for(int i = 0; i < n; i++){
            int[] freq = new int[26];
            for(int j = i; j < n; j++){
                freq[s.charAt(j) - 'a']++;
                int c = 0;
                boolean valid = true;
                for(int k : freq){
                    if(k != 0){
                        if(c == 0){
                            c = k;
                        }
                        else if(c != k){
                            valid = false;
                            break;   // important
                        }
                    }
                }
                if(valid){
                    result = Math.max(result, j - i + 1);
                }
            }
        }
        return result;
    }
}