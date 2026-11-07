class Solution {
    int n = 0;
    public int minFallingPathSum(int[][] matrix) {
        n = matrix.length;
        int minSum = Integer.MAX_VALUE;
        for(int j = 0; j<n; j++){
            minSum = Math.min(minSum, solve(0, j, matrix));
        }
        return minSum;
    }
    public int solve(int i, int j, int[][] matrix){
        if(i < 0 || i >= n || j < 0 || j >= n) return (int)1e9;
        if(i == n-1) return matrix[i][j];
        int below = solve(i+1, j, matrix);
        int leftD = solve(i+1, j-1, matrix);
        int rightD = solve(i+1, j+1, matrix);
        return matrix[i][j] + Math.min(below, Math.min(leftD, rightD));
    }
}
