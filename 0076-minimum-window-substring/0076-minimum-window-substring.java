class Solution {
    public String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();
        String str = "";
        if(n > m) return str;
        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();
        for(int i = 0; i<n; i++){
            m1.put(t.charAt(i), m1.getOrDefault(t.charAt(i),0)+1);
        }
        int i = 0, j = 0, cnt = 0, minLen = Integer.MAX_VALUE, startIndex = -1;
        while(j<m){
            char ch = s.charAt(j);
            if(m1.containsKey(ch)){
                m2.put(ch, m2.getOrDefault(ch, 0)+1);
                if(m2.get(ch).equals(m1.get(ch))){
                    cnt++;
                }
            }
            while(cnt == m1.size()){
                if(j-i+1 <= minLen){
                    minLen = j-i+1;
                    startIndex = i;
                }
                char startChar = s.charAt(i);
                if (m2.containsKey(startChar)) {
                    m2.put(startChar, m2.get(startChar) - 1);
                    if (m2.get(startChar) < m1.get(startChar)) {
                        cnt--;
                    }
                }
                i++;
            }
            j++;
        }
        return startIndex == -1 ? "" : s.substring(startIndex, startIndex + minLen);
    }
}