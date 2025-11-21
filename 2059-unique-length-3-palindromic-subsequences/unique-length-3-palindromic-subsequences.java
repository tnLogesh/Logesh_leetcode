class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first, -1);
        for (int i = 0; i < n; i++) {
            int ch = s.charAt(i) - 'a';
            if (first[ch] == -1) {
                first[ch] = i;
            }
            last[ch] = i;
        }
        int result = 0;
        for (int c = 0; c < 26; c++) {
            if (first[c] != -1 && last[c] - first[c] >= 2) {
                Set<Character> set = new HashSet<>();
                for (int i = first[c] + 1; i < last[c]; i++) {
                    set.add(s.charAt(i));
                }
                result += set.size();
            }
        }
        return result;
    }
}
