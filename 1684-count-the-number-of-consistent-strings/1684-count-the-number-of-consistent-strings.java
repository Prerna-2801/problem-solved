class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int cnt = 0;
        int[] freq = new int[26];
        for(int i = 0; i<allowed.length(); i++){
            char c = allowed.charAt(i);
            freq[c-'a']++;
        }
        for(int i = 0; i<words.length; i++){
            String s = words[i];
            int[] freqS = new int[26];
            for(int j = 0; j<s.length(); j++){
                freqS[s.charAt(j)-'a']++;
            }
            boolean valid = true;
            for (int k = 0; k < 26; k++) {
                if (freqS[k] > 0 && freq[k] == 0) {
                    valid = false;
                    break;
                }
            }

            if (valid) cnt++;
        }
        return cnt;
    }
}