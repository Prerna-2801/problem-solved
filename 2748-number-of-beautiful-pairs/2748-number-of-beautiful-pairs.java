class Solution {
    public int countBeautifulPairs(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                int x = first(nums[i]);
                int y = last(nums[j]);
                if(gcd(x, y) == 1) cnt++;
            }
        }
        return cnt;
    }
    public int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    public int first(int n){
        if(n < 10) return n;
        String s = Integer.toString(n);
        return s.charAt(0) - '0';
    }
    public int last(int n){
        if(n < 10) return n;
        String s = Integer.toString(n);
        return s.charAt(s.length()-1) - '0';
    }
}