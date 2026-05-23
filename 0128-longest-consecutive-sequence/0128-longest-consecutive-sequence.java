class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        int max = 1, cnt = 1;
        Arrays.sort(nums);
        for(int i = 1; i<nums.length; i++){
            if(nums[i] == nums[i-1]+1){
                cnt++;
                max = Math.max(cnt, max);
            }
            else if(nums[i] == nums[i-1]) continue;
            else cnt = 1;
        }
        return max;
    }
}