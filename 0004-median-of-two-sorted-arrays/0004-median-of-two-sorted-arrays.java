class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans = 0.0;
        int n = nums1.length;
        int m = nums2.length;
        int[] arr = new int[n+m];
        int i = 0, j = 0;
        int idx = 0;
        while(i < n && j < m){
            if(nums1[i] < nums2[j]){
                arr[idx++] = nums1[i];
                i++;
            }
            else{
                arr[idx++] = nums2[j];
                j++;
            }
        }
        while(i < n){
            arr[idx++] = nums1[i++];
        }
        while(j < m){
            arr[idx++] = nums2[j++];
        }
        if((n+m) % 2 != 0){
            ans = (double) arr[((n+m)/2)];
        }
        else{
            ans = (double) (arr[((n+m)/2)] + arr[((n+m)/2) - 1])/2.0;
        }
        return ans;
    }
}