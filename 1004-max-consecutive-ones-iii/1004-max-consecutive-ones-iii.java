class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int i = 0, j = 0, cnt = 0, max = 0;
        while(j < n){
            if(nums[j] == 0) cnt++;
            while(cnt > k){
                if(nums[i] == 0) cnt--;
                i++;
            }
            max = Math.max(max, j-i+1);
            j++;
        }
        return max;
    }
}