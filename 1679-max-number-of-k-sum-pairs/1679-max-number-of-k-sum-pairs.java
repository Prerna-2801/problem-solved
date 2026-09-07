class Solution {
    public int maxOperations(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int cnt = 0;
        int i = 0, j = n-1;
        while(i < j){
            int sum = nums[i] + nums[j];
            if(sum == k){
                cnt++;
                i++;
                j--;
            }
            else if(sum > k) j--;
            else i++;
        }
        return cnt;
    }
}