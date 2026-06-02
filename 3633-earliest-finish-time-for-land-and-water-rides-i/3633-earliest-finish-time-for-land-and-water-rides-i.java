class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int minFinishTime = Integer.MAX_VALUE;
        for(int i = 0; i<landStartTime.length; i++){
            for(int j = 0; j<waterStartTime.length; j++){
                int landStart = landStartTime[i];
                int landEnd = landStart + landDuration[i];
                int waterStartAfterLand = Math.max(landEnd, waterStartTime[j]);
                int finish1 = waterStartAfterLand + waterDuration[j];
                minFinishTime = Math.min(minFinishTime, finish1);
                int waterStart = waterStartTime[j];
                int waterEnd = waterStart + waterDuration[j];
                int landStartAfterWater = Math.max(waterEnd, landStartTime[i]);
                int finish2 = landStartAfterWater + landDuration[i];
                minFinishTime = Math.min(minFinishTime, finish2);
            }
        }
        return minFinishTime;
    }
}