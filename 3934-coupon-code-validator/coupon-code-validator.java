class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<int[]> valid = new ArrayList<>();
        Map<String, Integer> priority = new HashMap<>();
        priority.put("electronics", 0);
        priority.put("grocery", 1);
        priority.put("pharmacy", 2);
        priority.put("restaurant", 3);
        int n = code.length;
        for (int i = 0; i < n; i++) {
            if (isActive[i]
                && !code[i].equals("")
                && priority.containsKey(businessLine[i])) {
                String filtered = code[i].replaceAll("[^a-zA-Z0-9_]", "");
                if (filtered.equals(code[i])) {
                    valid.add(new int[]{i});
                }
            }
        }
        Collections.sort(valid, (a, b) -> {
            int i = a[0], j = b[0];
            int p1 = priority.get(businessLine[i]);
            int p2 = priority.get(businessLine[j]);

            if (p1 != p2) {
                return p1 - p2;
            }
            return code[i].compareTo(code[j]);
        });
        List<String> result = new ArrayList<>();
        for (int[] v : valid) {
            result.add(code[v[0]]);
        }
        return result;
    }
}
