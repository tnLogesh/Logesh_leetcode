class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        char[][] cells = new char[m][n];
        for (int[] w : walls)cells[w[0]][w[1]] = 'W';
        for (int[] g : guards)cells[g[0]][g[1]] = 'G';
        for (int i = 0; i < m; i++) {
            boolean seenGuard = false;
            for (int j = 0; j < n; j++) {
                if (cells[i][j] == 'W')
                    seenGuard = false;
                else if (cells[i][j] == 'G')
                    seenGuard = true;
                else if (seenGuard && cells[i][j] == 0)
                    cells[i][j] = 'S';
            }
            seenGuard = false;
            for (int j = n - 1; j >= 0; j--) {
                if (cells[i][j] == 'W')
                    seenGuard = false;
                else if (cells[i][j] == 'G')
                    seenGuard = true;
                else if (seenGuard && cells[i][j] == 0)
                    cells[i][j] = 'S';
            }
        }
        for (int j = 0; j < n; j++) {
            boolean seenGuard = false;
            for (int i = 0; i < m; i++) {
                if (cells[i][j] == 'W')
                    seenGuard = false;
                else if (cells[i][j] == 'G')
                    seenGuard = true;
                else if (seenGuard && cells[i][j] == 0)
                    cells[i][j] = 'S';
            }
            seenGuard = false;
            for (int i = m - 1; i >= 0; i--) {
                if (cells[i][j] == 'W')
                    seenGuard = false;
                else if (cells[i][j] == 'G')
                    seenGuard = true;
                else if (seenGuard && cells[i][j] == 0)
                    cells[i][j] = 'S';
            }
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (cells[i][j] == 0)
                    count++;
            }
        }
        return count;
    }
}
