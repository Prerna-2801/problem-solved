class Solution {
    public int countCommas(int n) {
        int ans = 0;
        int x = 1000;
        while(x <= n){
            int numbers = n-x+1;
            ans = ans + numbers;
            x = x * 1000;
        }
        return ans;
    }
}