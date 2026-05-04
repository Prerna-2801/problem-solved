class Solution {
    public int[] countOppositeParity(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            if(nums[i] % 2 != 0){ //odd 
                ans[i] = cntEven(nums, i+1);
            }
            else{
                ans[i] = cntOdd(nums, i+1); 
            }
        }
        return ans;
    }
    public int cntEven(int[] arr, int i){
        int cntE = 0;
        for(int j = i; j<arr.length; j++){
            if(arr[j] % 2 == 0){
                cntE++;
            }
        }
        return cntE;
    }
    public int cntOdd(int[] arr, int i){
        int cntO = 0;
        for(int j = i; j<arr.length; j++){
            if(arr[j] % 2 != 0){
                cntO++;
            }
        }
        return cntO;
    }
}