class Solution {
    public int diagonalSum(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int sumP = 0, sumS = 0;
        int row = 0, col = 0;
        while(row<m){
            sumP += mat[row][col];
            row++;
            col++;
        }
        row = 0;
        col = n-1;
        while(row<m){
            sumS += mat[row][col];
            row++;
            col--;
        }
        int finalSum = sumP + sumS;
        if(m % 2 == 0) return finalSum;
        else return finalSum - mat[m/2][n/2];
    }
}