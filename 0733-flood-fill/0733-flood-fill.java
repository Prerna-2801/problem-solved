class Solution {
    int m = 0, n = 0;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        m = image.length;
        n = image[0].length;
        int originalColor = image[sr][sc];
        int[][] ans = new int[m][n];
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                ans[i][j] = image[i][j];
            }
        }
        if(originalColor != color){
            dfs(image, sr, sc, color, originalColor,ans);
        }
        return ans;
    }
    public void dfs(int[][] image, int sr, int sc, int color, int originalColor, int[][] ans){
        if(sr < 0 || sr >= m || sc < 0 || sc >= n) return;
        if(image[sr][sc] != originalColor || ans[sr][sc] == color) return;
        ans[sr][sc] = color;
        dfs(image, sr-1, sc, color, originalColor, ans); //up
        dfs(image, sr+1, sc, color, originalColor, ans); //down
        dfs(image, sr, sc-1, color, originalColor, ans); //left
        dfs(image, sr, sc+1, color, originalColor, ans); //right
    }
}