class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        return solve(nums, n-1);
    }
    public int solve(int[] nums, int n){
        if(n < 0) return 0;
        if(n == 0) return nums[0];
        int rob = solve(nums, n-2) + nums[n];
        int skip = solve(nums, n-1);
        return Math.max(rob, skip);
    }
}
