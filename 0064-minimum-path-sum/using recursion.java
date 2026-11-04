class Solution {
    int m = 0, n = 0;
    public int minPathSum(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        return solve( 0, 0, grid);
    }
    public int solve( int i, int j, int[][] grid){
        if(i < 0 || i >= m || j < 0 || j >= n) return Integer.MAX_VALUE;
        if(i == m-1 && j == n-1) return grid[i][j];
        int right = solve( i, j+1, grid);
        int down = solve( i+1, j, grid);
        return grid[i][j] + Math.min(right, down);
    }
}
