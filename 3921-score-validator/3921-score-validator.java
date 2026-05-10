class Solution {
    public int[] scoreValidator(String[] events) {
        int s = 0, cnt = 0;
        for(int i = 0; i<events.length; i++){
            if(cnt == 10) break;
            String c = events[i];
            if(c.equals("0") || c.equals("1") || c.equals("2") || c.equals("3")|| c.equals("4") || c.equals("5") || c.equals("6")){
                s += Integer.valueOf(c);
            }
            else if(c.equals("W")){
                cnt += 1;
            }
            else{
                s += 1;
            }
        }
        return new int[]{s, cnt};
    }
}