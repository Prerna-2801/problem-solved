class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0; i<n; i++){
            Set<Integer> st = new HashSet<>();
            for(int j = i+1; j<n; j++){
                int x = -(nums[i] + nums[j]);
                if(st.contains(x)){
                    List<Integer> list = Arrays.asList(nums[i], nums[j], x);
                    Collections.sort(list);
                    set.add(list);
                }
                st.add(nums[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }
}