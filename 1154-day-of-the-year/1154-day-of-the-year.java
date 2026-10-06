class Solution {
    public int dayOfYear(String date) {
        int n = date.length();
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int d = Integer.parseInt(date.substring(8, n));
        int ans = 0;
        int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(isLeap(year)) m[1] = 29;
        for(int i = 1; i<=month; i++){
            if(i == month){
                ans += d;
                return ans;
            }
            ans += m[i-1];
        }
        return ans;
    }
    public boolean isLeap(int year){
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) return true;
        return false;
    }
}