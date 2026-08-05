class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        Queue<int[]> q = new LinkedList<>();
        for(int  i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(i == 0 || i == m-1 || j == 0 || j == n-1){
                    if(board[i][j] == 'O'){
                        q.offer(new int[]{i, j});
                        board[i][j] = '#';
                    }
                }
            }
        }
        int[] delRow = {-1, 1, 0, 0};
        int[] delCol = {0, 0, -1, 1};
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int u = curr[0], v = curr[1];
            for(int i = 0; i<4; i++){
                int nr = u + delRow[i];
                int nc = v + delCol[i];
                if(nr >= 0 && nr < m && nc >= 0 && nc < n){
                    if(board[nr][nc] == 'O'){
                        board[nr][nc] = '#';
                        q.offer(new int[]{nr, nc});
                    }
                }
            }
        }
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
                else if(board[i][j] == '#'){
                    board[i][j] = 'O';
                }
            }
        }
    }
}