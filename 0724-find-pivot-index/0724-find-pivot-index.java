class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] start = new int[n];
        start[0] = 0;
        for(int i = 1; i<n; i++){
            start[i] = nums[i-1] + start[i-1];
        }
        int[] end = new int[n];
        end[n-1] = 0;
        for(int i = n-2; i>=0; i--){
            end[i] = nums[i+1] + end[i+1];
        }
        for(int i = 0; i<n; i++){
            if(start[i] == end[i]) return i;
        }
        return -1;
    }
}