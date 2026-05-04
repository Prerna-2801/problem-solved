class Solution {
    public int findMin(int[] nums) {
        int ele = nums[0];
        for(int i = 1; i<nums.length; i++){
            if(nums[i] > ele) continue;
            else{
                ele = nums[i];
            }
        }
        return ele;
    }
}