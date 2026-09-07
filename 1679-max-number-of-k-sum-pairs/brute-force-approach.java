class Solution {
    public int maxOperations(int[] nums, int k) {
        int n = nums.length;
        boolean[] vis = new boolean[n];
        int cnt = 0;
        for(int i = 0; i<n; i++){
            if(vis[i]) continue;
            for(int j = i+1; j<n; j++){
                int sum = nums[i] + nums[j];
                if(sum == k){
                    cnt++;
                    vis[i] = true;
                    vis[j] = true;
                    break;
                }
            }
        }
        return cnt;
    }
}
