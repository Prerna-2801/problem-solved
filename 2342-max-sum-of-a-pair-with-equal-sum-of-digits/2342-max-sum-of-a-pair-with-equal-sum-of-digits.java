class Solution {
    public int maximumSum(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            int num = nums[i];
            int val = 0;
            while(num > 0){
                val += num%10;
                num /= 10;
            }
            if(map.containsKey(val)){
                max = Math.max(max, nums[i]+map.get(val));
                //We need this line because a single digit sum can appear three or more times in the array, and we always want to pair the current number with the largest previous number
                map.put(val, Math.max(nums[i], map.get(val)));
            }
            else map.put(val, nums[i]);

        }
        return (max == Integer.MIN_VALUE) ? -1 : max;
    }
}
