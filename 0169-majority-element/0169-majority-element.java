class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        int ele = -1;
        //first pass: finding the majority ele
        for(int i = 0; i<n; i++){
            if(cnt == 0){
                ele = nums[i];
                cnt++;
            }
            else if(ele == nums[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        //validating the majority ele
        cnt = 0;
        for(int i = 0; i<n; i++){
            if(nums[i] == ele){
                cnt++;
            }
        }
        if(cnt > (n/2)) return ele;
        return -1;

    }
}