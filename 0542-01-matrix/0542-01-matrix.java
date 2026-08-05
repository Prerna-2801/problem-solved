class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        boolean[][] vis = new boolean[m][n];
        int[][] dis = new int[m][n];
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(mat[i][j] == 0){
                    q.offer(new int[]{i, j, 0});
                    vis[i][j] = true;
                }
            }
        }
        int[] delRow = {-1, 1, 0, 0};
        int[] delCol = {0, 0, -1, 1};
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int u = curr[0], v = curr[1], step = curr[2];
            dis[u][v] = step;
            for(int i = 0; i<4; i++){
                int nr = u + delRow[i];
                int nc = v + delCol[i];
                if(nr < 0 || nr >= m || nc < 0 || nc >= n) continue;
                if(!vis[nr][nc]){
                    vis[nr][nc] = true;
                    q.offer(new int[]{nr, nc, step+1});
                }
            }
        }
        return dis;
    }
}