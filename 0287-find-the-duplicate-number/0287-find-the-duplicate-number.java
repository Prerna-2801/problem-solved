class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        set.add(nums[0]);
        for(int i = 1; i<nums.length; i++){
            if(!set.add(nums[i])){
                return nums[i];
            }
            set.add(nums[i]);
        }
        return -1;
    }
}