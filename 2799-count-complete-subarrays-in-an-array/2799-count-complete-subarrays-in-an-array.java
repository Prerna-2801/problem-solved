class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        int uniqueEle = uniqueCnt(nums, n);
        int cnt = 0;
        for(int i = 0; i<n; i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j = i; j<n; j++){
                set.add(nums[j]);
                if(set.size() == uniqueEle) cnt++;
            }
        }
        return cnt;
    }
    public int uniqueCnt(int[] arr, int n){
        HashSet<Integer> set = new HashSet<>();
        for(int num: arr){
            set.add(num);
        }
        return set.size();
    }
}