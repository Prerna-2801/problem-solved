class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int num: nums) set.add(num);
        int max = 0;
        for(int num : nums){
            if(set.contains(num) && !set.contains(num - 1)){
                int curr = num;
                int cnt = 0;
                while(set.contains(curr)){
                    set.remove(curr);
                    cnt++;
                    curr++;
                }
                max = Math.max(max, cnt);
            }
        }
        return max;
    }
}