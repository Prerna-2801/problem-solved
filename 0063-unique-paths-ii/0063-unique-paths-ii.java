class Solution {
    int m = 0, n = 0;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        m = obstacleGrid.length;
        n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        return solve(0, 0, m, n, obstacleGrid, dp);
    }
    public int solve(int i, int j, int m, int n, int[][] obstacleGrid, int[][] dp){
        if(i < 0 || i >= m || j < 0 || j >= n || obstacleGrid[i][j] == 1) return 0;
        if(i == m-1 && j == n-1) return 1;
        if(dp[i][j] != -1) return dp[i][j];
        int right = solve(i, j+1, m, n, obstacleGrid, dp);
        int down = solve(i+1, j, m, n, obstacleGrid, dp);
        dp[i][j] = right + down;
        return dp[i][j];
    }

}