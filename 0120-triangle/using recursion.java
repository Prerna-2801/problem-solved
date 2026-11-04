class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        return solve(0, 0, triangle);
    }
    public int solve(int i, int j, List<List<Integer>> triangle){
        if(i == triangle.size()) return 0;
        int currRow = solve(i+1, j, triangle);
        int nextRow = solve(i+1, j+1, triangle);
        return triangle.get(i).get(j) + Math.min(currRow, nextRow);
    }
}
