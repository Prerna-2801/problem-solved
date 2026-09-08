class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double max = Integer.MIN_VALUE;
        int i = 0, j = 0, sum = 0;
        while(j < n){
            sum += nums[j];
            if(j-i+1 == k){
                double avg = (double) sum/k;
                max = Math.max(avg, max);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        return max;
    }
}