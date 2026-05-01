class Solution {
    public int pivotIndex(int[] nums) {
        int sumL = 0, sumR = 0;
        for(int i = 0; i<nums.length; i++){
            sumL = f(nums, 0, i-1);
            sumR = f(nums, i+1, nums.length-1);
            if(sumL == sumR) return i;
        }
        return -1;
    }
    public int f(int[] a, int i, int j){
        int sum = 0;
        while(i <= j){
            sum += a[i];
            i++;
        }
        return sum;
    }
}