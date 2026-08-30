class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n = nums.length;
        long[] c = new long[n];
        long max = nums[0];
        for(int i = 0; i<n; i++){
            if(nums[i] > max) max = nums[i];
            c[i] = nums[i] + max;
        }
        for(int i = 1; i<n; i++){
            c[i] += c[i-1];
        }
        return c;
    }
}