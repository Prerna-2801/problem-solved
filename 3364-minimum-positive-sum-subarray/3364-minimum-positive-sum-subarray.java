class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            int len = 0, sum = 0;
            for(int j = i; j<n; j++){
                sum += nums.get(j);
                len++;
                if(sum > 0 && len >= l && len <= r){
                    min = Math.min(sum, min);
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}