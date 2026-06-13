class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        HashSet<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for(int i = 0;i<n;i++){
            HashSet<Integer> set2 = new HashSet<>();
            for(int j = i+1;j<n;j++){
                int thirdSum = -(nums[i]+nums[j]);
                if(set2.contains(thirdSum)){
                    List<Integer> trip = new ArrayList();
                    trip.add(nums[i]);
                    trip.add(nums[j]);
                    trip.add(thirdSum);
                    Collections.sort(trip);
                    if(set.contains(trip)){
                        continue;
                    }
                    else{
                        ans.add(trip);
                        set.add(trip);
                    }
                }
                else {
                    set2.add(nums[j]);
                }
            }
        }
        return ans;
    }
}