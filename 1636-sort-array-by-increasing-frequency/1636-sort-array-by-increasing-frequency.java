class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int[] ans = new int[nums.length];
        ArrayList<Integer> list = new ArrayList<>();
        for(int num: nums){
            list.add(num);
        }
        Collections.sort(list, (a, b) -> {
            int freqA = map.get(a);
            int freqB = map.get(b);
            if (freqA != freqB) {
                return freqA - freqB;
            }
            return b - a;
        });
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }

        return nums;
    }
}