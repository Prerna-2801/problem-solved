class Solution {
    public int daysBetweenDates(String date1, String date2) {
        int d1 = from1971(date1);
        int d2 = from1971(date2);
        return Math.abs(d1-d2);
    }
    public int from1971(String date){
        int n = date.length();
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int d = Integer.parseInt(date.substring(8, n));
        int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int ans = 0;
        for(int y = 1971; y<= year; y++){
            if( isLeap(y)) m[1] = 29;
            for(int i = 1; i<=12; i++){
                if(y == year && i == month){
                    ans += d;
                    return ans;
                }
                ans += m[i-1];
            }
            m[1] = 28;
        }
        return ans;
    }
    public boolean isLeap(int year){
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) return true;
        return false;
    }
}