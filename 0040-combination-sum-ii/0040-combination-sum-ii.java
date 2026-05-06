class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        f(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
    public void f(int index, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        if(index == arr.length) return;
        for(int i = index; i<arr.length; i++){
            if(i >  index && arr[i] == arr[i-1]) continue;
            if(arr[i] > target) break;
            ds.add(arr[i]);
            f(i+1, arr, target-arr[i], ans, ds);
            ds.remove(ds.size()-1);
        }
    }
}