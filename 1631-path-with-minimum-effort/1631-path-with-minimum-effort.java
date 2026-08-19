class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[2] - b[2]);
        boolean[][] vis = new boolean[n][m];
        pq.offer(new int[]{0, 0, 0});
        int[] row = {-1, 1, 0, 0};
        int[] col = {0, 0, -1, 1};
        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int u = curr[0];
            int v = curr[1];
            int effort = curr[2];
            if(vis[u][v]) continue;
            vis[u][v] = true;
            if(u == n-1 && v == m-1){
                return effort;
            }
            for(int i = 0; i<4; i++){
                int nr = u + row[i];
                int nc = v + col[i];
                if(nr >= n || nr < 0 || nc >= m || nc < 0 || vis[nr][nc]) continue;
                int diff = Math.abs(heights[u][v] - heights[nr][nc]);
                int newEffort = Math.max(effort, diff);
                pq.offer(new int[]{nr, nc, newEffort});
            }
        }
        return 0;
    }
}