class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int freshCnt = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(grid[i][j] == 1) freshCnt++;
                else if(grid[i][j] == 2) q.offer(new int[]{i,j});
            }
        }
        if(freshCnt == 0) return 0;
        int time = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i<size; i++){
                int[] rottenLoc = q.poll();
                int r = rottenLoc[0];
                int c = rottenLoc[1];
                int[][] neighbors = {{r-1,c},{r+1,c},{r,c+1},{r,c-1}};
                for(int[] neighbor: neighbors){
                    int nr = neighbor[0];
                    int nc = neighbor[1];
                    if(nr < 0 || nr >= n || nc < 0 || nc >= m || grid[nr][nc] == 2 || grid[nr][nc] == 0){
                        continue;
                    } 
                    q.offer(new int[]{nr,nc});
                    grid[nr][nc] = 2;
                    freshCnt--;
                    if(freshCnt == 0) return time+1;
                }
            }
            time++;
        }
        return -1;
    }
}