class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        char[] arr = s.toCharArray();
        for(int i = 1; i<arr.length; i++){
            int diff = Math.abs(arr[i] - arr[i-1]);
            if(diff == 0 || diff == 1 || diff == 2) continue;
            else return false;
        }
        return true;
    }
}