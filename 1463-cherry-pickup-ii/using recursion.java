class Solution {
    int row = 0, col = 0;
    public int cherryPickup(int[][] grid) {
        row = grid.length;
        col = grid[0].length;
        return solve(0, 0, col-1, grid);
    }
    public int solve(int i, int j1, int j2,int[][] grid){
        if(i < 0 || i >= row || j1 < 0 || j1 >= col || j2 < 0 || j2 >= col) return (int)-1e9;
        if(i == row-1){
            if(j1 == j2) return grid[i][j1];
            else return grid[i][j1] + grid[i][j2];
        }
        int max = (int) -1e8;
        for(int d1 = -1; d1 <= 1; d1++){
            for(int d2 = -1; d2 <= 1; d2++){
                int value;
                if(j1 == j2) value = grid[i][j1];
                else value = grid[i][j1] + grid[i][j2];
                value += solve(i + 1, j1 + d1, j2 + d2, grid);
                max = Math.max(max, value);
            }
        }
        return max;

    }
}
