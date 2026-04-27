class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;
        int max = 0;
        int sum = 0;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                sum += accounts[i][j];
            }
            max = Math.max(max, sum);
            sum = 0;
        }
        return max;
    }
}