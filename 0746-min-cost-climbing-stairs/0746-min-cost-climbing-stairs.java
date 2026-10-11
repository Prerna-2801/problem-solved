class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return solve(cost, n, dp);
    }
    public int solve(int[] cost, int n, int[] dp){
        if(n == 0 || n == 1) return 0;
        if(dp[n] != -1) return dp[n];
        int option1 = solve(cost, n-1, dp) + cost[n-1];
        int option2 = solve(cost, n-2, dp) + cost[n-2];
        dp[n] = Math.min(option1, option2);
        return dp[n];
    }
}