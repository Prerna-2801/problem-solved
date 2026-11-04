class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        for(int[] row: dp) Arrays.fill(row, Integer.MAX_VALUE);
        return solve(0, 0, triangle, dp);
    }
    public int solve(int i, int j, List<List<Integer>> triangle, int[][] dp){
        if(i == triangle.size()) return 0;
        if(dp[i][j] != Integer.MAX_VALUE) return dp[i][j]; 
        int currRow = solve(i+1, j, triangle, dp);
        int nextRow = solve(i+1, j+1, triangle, dp);
        dp[i][j] = triangle.get(i).get(j) + Math.min(currRow, nextRow);
        return dp[i][j];
    }
}