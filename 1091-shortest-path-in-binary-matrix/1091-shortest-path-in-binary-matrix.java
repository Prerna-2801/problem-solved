class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if(grid[0][0] != 0 || grid[n-1][n-1] != 0) return -1;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0, 1});
        boolean[][] vis = new boolean[n][n];
        vis[0][0] = true;
        int[] row = {-1, 1, 0, 0, -1, -1, 1, 1};
        int[] col = { 0, 0, -1, 1, -1, 1, -1, 1};
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int u = curr[0];
            int v = curr[1];
            int step = curr[2];
            if(u == n-1 && v == n-1) return step;
            for(int i = 0; i<8; i++){
                int nr = u + row[i];
                int nc = v + col[i];
                if(nr >= n || nr < 0 || nc >= n || nc < 0) continue;
                if(vis[nr][nc]) continue;
                if(grid[nr][nc] == 1) continue;
                vis[nr][nc] = true;
                q.offer(new int[]{nr, nc, step + 1});
            }
        }
        return -1;
    }
}