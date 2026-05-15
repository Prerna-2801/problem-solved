class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            ans[i] = f(nums, nums[i]);
        }
        return ans;
    }
    public int f(int[]  arr, int x){
        int cnt = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < x) cnt++;
        }
        return cnt;
    }
}