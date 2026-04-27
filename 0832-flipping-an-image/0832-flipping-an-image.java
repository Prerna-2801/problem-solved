class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int r = image.length;
        int c = image[0].length;
        int[][] ans = new int[r][c];
        for(int i = 0; i<r; i++){
            reverse(image[i]);
            invert(image[i]);
        }
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                ans[i][j] = image[i][j];
            }
        }
        return ans;
    }
    public void reverse(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public void invert(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            if(arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
    }
}