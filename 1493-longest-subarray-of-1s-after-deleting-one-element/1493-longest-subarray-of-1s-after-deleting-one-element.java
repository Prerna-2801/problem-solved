class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int i = 0, j = 0,cnt0 = 0;
        int max = Integer.MIN_VALUE;
        while(j < n){
            if(nums[j] == 0){
                cnt0++;
            }
            while(cnt0 > 1){
                if(nums[i] == 0) cnt0--;
                i++;
            }
            max = Math.max(max, (j-i));
            j++;
        }
        return max;
    }
}