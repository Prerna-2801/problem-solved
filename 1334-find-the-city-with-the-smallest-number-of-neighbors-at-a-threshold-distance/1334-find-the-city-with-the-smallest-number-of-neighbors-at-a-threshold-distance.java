class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] mat = new int[n][n];
        for(int i = 0; i<n; i++){
            Arrays.fill(mat[i], (int)1e9);
            mat[i][i] = 0;
        }
        for(int[] e: edges){
            int u = e[0];
            int v = e[1];
            int wt = e[2];
            mat[u][v] = wt;
            mat[v][u] = wt;
        }
        for(int k = 0; k<n; k++){
            for(int i = 0; i<n; i++){
                for(int j = 0; j<n; j++){
                    if(mat[i][k] != (int)1e9 && mat[k][j] != (int)1e9){
                        mat[i][j] = Math.min(mat[i][j], mat[i][k] + mat[k][j]);
                    }
                }
            }
        }
        int ans = -1, minNeighbors = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            int cnt = 0;
            for(int j = 0; j<n; j++){
                if(i == j) continue;
                if(mat[i][j] <= distanceThreshold){
                    cnt++;
                }
            }
            if(cnt <= minNeighbors){
                minNeighbors = cnt;
                ans = i;
            }
        }
        return ans;
    }
}