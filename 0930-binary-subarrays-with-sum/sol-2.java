class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return f(nums, goal) - f(nums, goal-1);
    }

    private int f(int[] nums, int goal){
        int n = nums.length;
        int maxLen = 0;
        if(goal<0) return 0;
        int i = 0, j = 0, sum = 0;
        while(j<n){
            sum += nums[j];
            while(sum>goal){
                sum = sum - nums[i];
                i++;
            }
            maxLen += j-i+1;
            j++;
        }
        return maxLen;
    }
}
