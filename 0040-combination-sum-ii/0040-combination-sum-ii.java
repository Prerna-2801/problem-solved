class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        f(ans, 0, new ArrayList<>(), candidates, target, 0);
        return ans;
    }
    public void f(List<List<Integer>> ans, int sum, List<Integer> ds, int[] candidates, int target, int i){
        if(sum == target){
            ans.add(new ArrayList<>(ds));
            return;
        }
        if(i >= candidates.length || sum > target) return;
        ds.add(candidates[i]);
        f(ans, sum+candidates[i], ds, candidates, target, i+1);
        ds.remove(ds.size()-1);
        while(i+1 < candidates.length && candidates[i] == candidates[i+1]){
            i++;
        }
        f(ans, sum, ds, candidates, target, i+1);
    }
}