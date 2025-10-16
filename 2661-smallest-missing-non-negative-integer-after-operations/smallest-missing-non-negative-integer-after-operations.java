class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int x : nums) {
            int r = ((x % value) + value) % value;
            count.put(r, count.getOrDefault(r, 0) + 1);
        }
        int i = 0;
        while (true) {
            int r = i % value;
            if (!count.containsKey(r) || count.get(r) == 0) {
                return i;
            }
            count.put(r, count.get(r) - 1);
            i++;
        }
    }
}