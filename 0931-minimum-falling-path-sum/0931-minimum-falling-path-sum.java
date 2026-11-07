class Solution {
    int n = 0;
    public int minFallingPathSum(int[][] matrix) {
        n = matrix.length;
        int minSum = Integer.MAX_VALUE;
        int[][] dp = new int[n][n];
        for(int[] row: dp) Arrays.fill(row, 200);
        for(int j = 0; j<n; j++){
            minSum = Math.min(minSum, solve(0, j, matrix, dp));
        }
        return minSum;
    }
    public int solve(int i, int j, int[][] matrix, int[][] dp){
        if(i < 0 || i >= n || j < 0 || j >= n) return (int)1e9;
        if(i == n-1) return matrix[i][j];
        if(dp[i][j] != 200) return dp[i][j];
        int below = solve(i+1, j, matrix, dp);
        int leftD = solve(i+1, j-1, matrix, dp);
        int rightD = solve(i+1, j+1, matrix, dp);
        dp[i][j] = matrix[i][j] + Math.min(below, Math.min(leftD, rightD));
        return dp[i][j];
    }
}