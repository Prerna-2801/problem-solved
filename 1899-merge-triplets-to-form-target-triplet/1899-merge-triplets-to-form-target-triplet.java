class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int[] res = new int[3];
        for(int[] s: triplets){
            if(s[0] <= target[0] && s[1] <= target[1] && s[2] <= target[2]){
                res[0] = Math.max(s[0], res[0]);
                res[1] = Math.max(s[1], res[1]);
                res[2] = Math.max(s[2], res[2]);
            }
        }
        if(res[0] == target[0] && res[1] == target[1] && res[2] == target[2]) return true;
        return false;
    }
}