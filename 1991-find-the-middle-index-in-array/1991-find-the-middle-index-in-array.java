class Solution {
    public int findMiddleIndex(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
            map.put(i, sum);
        }
        sum = 0;
        int rightSum = 0, idx = -1;
        for(int i = nums.length-1; i >= 0; i--){
            int leftSum = (i == 0) ? 0: map.get(i-1);
            if(leftSum == rightSum) idx = i;
            rightSum += nums[i];
        }
        return idx;
    }
}