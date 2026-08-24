class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] ans = new int[n];
        if(A[0] == B[0]) ans[0] = 1;
        else ans[0] = 0;
        for(int i = 1; i<n; i++){
            int cnt = 0;
            if(A[i] == B[i]){
                ans[i] = 1 + ans[i-1];
            }
            else{
                int x = findIndex(B, A[i]);
                if(x <= i) cnt++;
                int y = findIndex(A, B[i]);
                if(y <= i) cnt++;
                cnt += ans[i-1];
                ans[i] = cnt;
            }
        }
        return ans;
    }
    public int findIndex(int[] arr, int x){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
}