class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return nums[0];
        int[] dp1 = new int[n];
        Arrays.fill(dp1, -1);
        int option1 = solve(nums, n-1, 1, dp1);
        int[] dp2 = new int[n];
        Arrays.fill(dp2, -1);
        int option2 = solve(nums, n-2, 0, dp2);
        return Math.max(option1, option2);
    }
    public int solve(int[] nums, int n, int start, int[] dp){
        if(n < start) return 0;
        if(n == start) return nums[start];
        if(dp[n] != -1) return dp[n];
        int rob = solve(nums, n-2, start, dp) + nums[n];
        int skip = solve(nums, n-1, start, dp);
        dp[n] = Math.max(rob, skip);
        return dp[n];
    }
}