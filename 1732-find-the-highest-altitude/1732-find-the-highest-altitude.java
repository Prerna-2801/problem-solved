class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int val = 0, ans = 0;
        for(int i = 0; i<n; i++){
            val += gain[i];
            ans = Math.max(val, ans);
        }
        return ans;
    }
}