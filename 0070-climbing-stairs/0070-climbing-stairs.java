class Solution {
    public int climbStairs(int n) {
        if(n <= 1) return 1;
        int[] dp = new int[n+1];
        return solve(n, dp);
    }
    public int solve(int n, int[] dp){
        if(n <= 1) return 1;
        if(dp[n] != 0) return dp[n];
        dp[n] = solve(n-1, dp) + solve(n-2, dp);
        return dp[n];
    }
}