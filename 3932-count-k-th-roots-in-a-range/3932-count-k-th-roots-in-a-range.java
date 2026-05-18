class Solution {
    public int countKthRoots(int l, int r, int k) {
        if (k == 1) {
            return r - l + 1;
        }
        int count = 0;
        if (l == 0) {
            count++;
            l = 1; 
        }
        if (l > r) {
            return count;
        }
        count += (floorKthRoot(r, k) - floorKthRoot(l - 1, k));
        return count;
    }

    private int floorKthRoot(int n, int k) {
        if (n <= 0) return 0;
        int root = (int) Math.pow(n, 1.0 / k);
        while (pow(root + 1, k) <= n) {
            root++;
        }
        while (pow(root, k) > n) {
            root--;
        }
        
        return root;
    }
    private long pow(long base, int exp) {
        long result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
            if (result > Integer.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        }
        return result;
    }
}
