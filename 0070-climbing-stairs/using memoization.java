class Solution {
    public int climbStairs(int n) {
        if(n == 1 || n == 2) return n;
        int[] dp = new int[n+1];
        return solve(dp, n);
    }
    public int solve(int[] dp, int n){
        if(n == 1 || n == 2) return n;
        if(dp[n] != 0) return dp[n];
        dp[n] = solve(dp, n-1) + solve(dp, n-2);
        return dp[n];
    }
}
