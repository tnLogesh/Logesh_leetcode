class Solution {
    public int binaryGap(int n) {
        String str = Integer.toBinaryString(n);
        int len = str.length();
        char[] arr = str.toCharArray();
        int i = 0, j = 1;
        int max = 0;
        while (i < len && arr[i] != '1') {
            i++;
        }
        j = i + 1;
        while (j < len) {
            if (arr[j] == '1') {
                max = Math.max(max, j - i);
                i = j;
            }
            j++;
        }
        return max;
    }
}