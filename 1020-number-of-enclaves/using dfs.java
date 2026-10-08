class Solution {
    int m = 0, n = 0;
    public int numEnclaves(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        //left and right column
        for(int i = 0; i < m; i++){
            if(grid[i][0] == 1) dfs(grid, i, 0);
            if(grid[i][n - 1] == 1) dfs(grid, i, n - 1);
        }

        //top and bottom row
        for(int j = 0; j < n; j++){
            if (grid[0][j] == 1) dfs(grid, 0, j);
            if (grid[m - 1][j] == 1) dfs(grid, m - 1, j);
        }
        int cnt = 0;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(grid[i][j] == 1){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public void dfs(int[][] grid, int i, int j){
        if(i >= m || i < 0 || j >= n || j < 0) return;
        if(grid[i][j] == 0) return;
        grid[i][j] = 0;
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    }
} 
