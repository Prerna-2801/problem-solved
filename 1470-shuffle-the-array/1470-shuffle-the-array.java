class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[]  ans = new int[2*n];
        int i = 0, j = n;
        int idx = 0;
        while(j < 2*n){
            ans[idx++] = nums[i++];
            ans[idx++] = nums[j++];
        }
        return ans;
    }
}