class Solution {
    public boolean checkValid(int[][] matrix) {
        Set<Integer> set = new HashSet<>();
        int n = matrix.length;
        for(int i = 1; i<=n; i++){
            set.add(i);
        }
        for(int i = 0; i<n; i++){
            Set<Integer> set2 = new HashSet<>();
            for(int j = 0; j<n; j++){
                set2.add(matrix[i][j]);
            }
            if(!set.equals(set2)) return false;
        }
        for(int j = 0; j<n; j++){
            Set<Integer> set3 = new HashSet<>();
            for(int i = 0; i<n; i++){
                set3.add(matrix[i][j]);
            }
            if(!set.equals(set3)) return false;
        }
        return true;
    }
}