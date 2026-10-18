class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int max = Integer.MIN_VALUE;
        int prefix = 1;
        for(int i = 0; i<n; i++){
            prefix *= nums[i];
            max = Math.max(max, prefix);
            if(prefix == 0) prefix = 1;
        }
        int suffix = 1;
        for(int i = n-1; i>=0; i--){
            suffix *= nums[i];
            max = Math.max(max, suffix);
            if(suffix == 0) suffix = 1;
        }
        return max;
    }
}