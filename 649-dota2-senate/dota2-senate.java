class Solution {
    public String predictPartyVictory(String senate) {
        char[] arr = senate.toCharArray();
        int n = arr.length;
        boolean radiantAlive = true, direAlive = true;

        while (true) {
            radiantAlive = false;
            direAlive = false;

            for (int i = 0; i < n; i++) {
                if (arr[i] == 'X') continue;

                if (arr[i] == 'R') {
                    radiantAlive = true;
                    int j = (i + 1) % n;
                    while (arr[j] != 'D') {
                        j = (j + 1) % n;
                        if (j == i) break;
                    }
                    if (arr[j] == 'D') arr[j] = 'X';
                } else if (arr[i] == 'D') {
                    direAlive = true;
                    int j = (i + 1) % n;
                    while (arr[j] != 'R') {
                        j = (j + 1) % n;
                        if (j == i) break;
                    }
                    if (arr[j] == 'R') arr[j] = 'X';
                }
            }

            if (!radiantAlive) return "Dire";
            if (!direAlive) return "Radiant";
        }
    }
}
