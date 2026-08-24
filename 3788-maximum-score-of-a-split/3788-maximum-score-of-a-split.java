class Solution {
    public long maximumScore(int[] nums) {
        int n = nums.length;
        long[] prefixSum = new long[n];
        long sum = (long) nums[0];
        prefixSum[0] = sum;
        for(int i = 1; i<n; i++){
            sum += (long) nums[i];
            prefixSum[i] = sum;
        }
        long[] suffixMin = new long[n];
        suffixMin[n-1] = nums[n-1];
        long min = Long.MAX_VALUE;
        for(int i = n-2; i>=0; i--){
            min = Math.min((long) nums[i+1], min);
            suffixMin[i] = min;
        }
        sum = 0;
        long ans = Long.MIN_VALUE;
        for(int i = 0 ; i<n-1; i++){
            sum = prefixSum[i] - suffixMin[i];
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}