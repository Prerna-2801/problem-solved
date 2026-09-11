class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i<2; i++){
            ans.add(new ArrayList<>());
        }
        Set<Integer> set1 = new HashSet<>();
        for(int i: nums1) set1.add(i);
        Set<Integer> set2 = new HashSet<>();
        for(int i: nums2) set2.add(i);
        for(int num: nums2){
            if(set1.contains(num)) set1.remove(num);
        }
        for(int x: set1){
            ans.get(0).add(x);
        }
        for(int num: nums1){
            if(set2.contains(num)) set2.remove(num);
        }
        for(int x: set2){
            ans.get(1).add(x);
        }
        return ans;
    }
}