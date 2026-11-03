class Solution {
    int m = 0, n = 0;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        m = obstacleGrid.length;
        n = obstacleGrid[0].length;
        return solve(0, 0, m, n, obstacleGrid);
    }
    public int solve(int i, int j, int m, int n, int[][] obstacleGrid){
        if(i < 0 || i >= m || j < 0 || j >= n || obstacleGrid[i][j] == 1) return 0;
        if(i == m-1 && j == n-1) return 1;
        int right = solve(i, j+1, m, n, obstacleGrid);
        int down = solve(i+1, j, m, n, obstacleGrid);
        return right + down;
    }

}
