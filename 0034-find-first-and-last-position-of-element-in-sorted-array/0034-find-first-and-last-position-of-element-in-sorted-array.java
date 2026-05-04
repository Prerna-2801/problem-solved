class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = first(nums, target);
        ans[1] = second(nums, target);
        return ans;
    }
    public int first(int[] arr, int x){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int res = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == x){
                res = mid;
                high = mid-1;
            }
            else if(arr[mid] < x) low = mid+1;
            else high = mid-1;
        }
        return res;
    }
    public int second(int[] arr, int x){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int res = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == x){
                res = mid;
                low = mid+1;
            }
            else if(arr[mid] < x) low = mid+1;
            else high = mid-1;
        }
        return res;
    }
}