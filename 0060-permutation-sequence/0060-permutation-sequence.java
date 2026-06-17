class Solution {
    public String getPermutation(int n, int k) {
        k = k-1;
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            list.add(i);
        }
        for(int i = 0; i<n; i++){
            int block_size = factorial(list.size()-1);
            int idx = k/block_size;
            sb.append(list.get(idx));
            list.remove(list.get(idx));
            k = k % block_size;

        }
        return sb.toString();
    }
    public int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}