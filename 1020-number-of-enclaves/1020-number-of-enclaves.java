class Solution {
    public int numEnclaves(int[][] grid) {
        int cnt = 0;
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] vis = new boolean[m][n];
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(i == 0 || i == m-1 || j == 0 || j == n-1){
                    if(grid[i][j] == 1 && !vis[i][j]){
                        dfs(grid, vis, i, j, m, n);
                    }
                }
            }
        }
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(grid[i][j] == 1 && !vis[i][j]){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public void dfs(int[][] grid, boolean[][] vis, int u, int v, int m, int n){
        if(u < 0 || u >= m || v < 0 || v >= n || vis[u][v] || grid[u][v] == 0){
            return;
        }
        vis[u][v] = true;
        dfs(grid, vis, u-1, v, m, n);
        dfs(grid, vis, u+1, v, m, n);
        dfs(grid, vis, u, v-1, m, n);
        dfs(grid, vis, u, v+1, m, n);
    }
}