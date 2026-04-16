class Solution {
    public int numberOfSpecialChars(String word) {
        int cnt = 0;
        int[] l = new int[26];
        int[] u = new int[26];
        for(int i = 0; i< word.length(); i++){
            char c = word.charAt(i);
            if(Character.isLowerCase(c)) l[c-'a']++;
            else u[c - 'A']++;
        }
        for(int i = 0; i<26; i++){
            if(l[i] >0 && u[i] > 0){
                cnt++;
            }
        }
        return cnt;
    }
}