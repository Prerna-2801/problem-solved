class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] arr = new char[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                arr[i][j] = '.';
            }
        }
        f(n, 0, arr, ans);
        return ans;
    }
    public void f(int n, int row, char[][] arr, List<List<String>> ans){
        if(row == n){
            List<String> list = new ArrayList<>();
            for(char[] c : arr){
                list.add(new String(c));
            }
            ans.add(list);
            return;
        }
        for(int col = 0; col <n; col++){
            if(isPossible(n, row, col, arr)){
                arr[row][col] = 'Q';
                f(n, row+1, arr, ans);
                arr[row][col] = '.';
            }
        }
    }
    public boolean isPossible(int n, int row, int col, char[][] arr){
        for(int i = 0; i<n; i++){
            if(arr[i][col] == 'Q') return false;
        }
        for(int i = row-1, j = col-1; i>=0 && j>=0; i--, j--){
            if(arr[i][j] == 'Q') return false;
        }
        for(int i = row-1, j = col+1; i>=0 && j<n; i--, j++){
            if(arr[i][j] == 'Q') return false;
        }
        return true;
    }
}