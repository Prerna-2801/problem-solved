class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            if(!list.contains(nums[i])) list.add(nums[i]);
        }
        int l = 0, h = list.size()-1;
        while(l < h){
            int mid = (l+h)/2;
            if(list.get(mid) > list.get(list.size()-1)){
                l = mid+1;
            }
            else{
                h = mid;
            }
        }
        return list.get(l);
    }
}