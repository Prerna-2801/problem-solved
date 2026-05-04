class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int low = largest(weights);
        int high = sum(weights);
        while(low < high){
            int mid = (low+high)/2;
            if(isPossible(weights, days, mid)) high = mid;
            else low = mid+1;
        }
        return low;
    }
    public int largest(int[] arr){
        int ele = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] > ele) ele = arr[i];
        }
        return ele;
    }
    public int sum(int[] arr){
        int total = 0;
        for(int i = 0; i<arr.length; i++){
            total += arr[i];
        }
        return total;
    }
    public boolean isPossible(int[] arr, int days, int x){
        int d = 1;
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            if(sum + arr[i] <= x){
                sum += arr[i];
            }
            else{
                d++;
                sum = arr[i];
                if(d > days) return false;
            }
        }
        return true;
    }
}