class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int cnt = 1, lastEndTime = intervals[0][1];
        for(int i = 1; i<intervals.length; i++){
            if(intervals[i][0] >= lastEndTime){
                cnt++;
                lastEndTime = intervals[i][1];
            }
        }
        return intervals.length-cnt;
    }
}