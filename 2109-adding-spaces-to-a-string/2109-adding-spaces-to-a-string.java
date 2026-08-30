class Solution {
    public String addSpaces(String s, int[] spaces) {
        int n = spaces.length;
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        int start = -1;
        for(int i = 0; i<n; i++){
            if(start == -1) start = 0;
            else start = spaces[i-1];
            sb.append(s.substring(start, spaces[i]));
            sb.append(" ");
        }
        sb.append(s.substring(spaces[n-1], len));
        return sb.toString();
    }
}