class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean changed;
        int elapsedTime = 0;
        int[][] directions = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        while (true) {
            changed = false;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (grid[i][j] == elapsedTime + 2) {
                        for (int[] dir : directions) {
                            int x = i + dir[0];
                            int y = j + dir[1];
                            if (isSafe(x, y, n, m) && grid[x][y] == 1) {
                                grid[x][y] = grid[i][j] + 1;
                                changed = true;
                            }
                        }
                    }
                }
            }
            if (!changed) {
                break;
            }
            elapsedTime++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }
        return elapsedTime;
    }
    private boolean isSafe(int i, int j, int n, int m) {
        return 0 <= i && i < n && 0 <= j && j < m;
    }
}