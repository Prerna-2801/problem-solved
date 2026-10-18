class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        for(int num: nums){
            if(set.contains(num) && !set.contains(num-1)){
                int curr = num, cnt = 0;
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
