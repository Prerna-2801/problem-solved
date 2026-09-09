class Solution {
    public long countCommas(long n) {
        long ans = 0;
        long x = 1000;
        while(x <= n){
            long numbers = n-x+1;
            ans = ans + numbers;
            x = x * 1000;
        }
        return ans;
    }
}