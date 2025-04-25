class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;
        Map<Character, String> map = new HashMap<>();
        Set<String> usedWords = new HashSet<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];
            if (map.containsKey(c)) {
                if (!map.get(c).equals(w)) return false;
            } else {
                if (usedWords.contains(w)) return false; 
                map.put(c, w);
                usedWords.add(w);
            }
        }
        return true;
    }
}
