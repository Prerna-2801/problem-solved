class Solution {
    public int minElement(int[] nums) {
        int len = nums.length;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<len; i++){
            min = Math.min(min, f(nums[i]));
        }
        return min;
    }
    public int f(int n){
        int sum = 0;
        while(n > 0){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
}