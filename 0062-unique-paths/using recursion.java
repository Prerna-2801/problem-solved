class Solution {
    public int uniquePaths(int m, int n) {
        return solve(0, 0, m, n);
    }
    public int solve(int i, int j, int m, int n){
        if(i == m-1 && j == n-1) return 1;
        if(i >= m || i < 0 || j < 0 || j >= n) return 0;
        int right = solve(i, j+1, m, n);
        int down = solve(i+1, j, m, n);
        return right+down;
    }
}
