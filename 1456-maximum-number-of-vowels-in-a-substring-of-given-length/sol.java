class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int i = 0, j = 0;
        int cnt = 0, max = Integer.MIN_VALUE;
        while(j < n){
            if(s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'u') cnt++;
            if(j-i+1 == k){
                max = Math.max(cnt, max);
                if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') cnt--;
                i++;
            }
            j++;
        }
        return max;
    }
}
