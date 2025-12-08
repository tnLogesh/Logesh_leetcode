class Solution {
    public int countTriples(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int sum = i * i + j * j;
                int k = (int) Math.sqrt(sum);
                if (k * k == sum && k <= n) {
                    result++;
                }
            }
        }
        return result*2;
    }
}