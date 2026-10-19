class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Character> mapS = new HashMap<>();
        Map<Character, Character> mapT = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(mapS.containsKey(ch1)){
                if(mapS.get(ch1) != ch2) return false;
            }
            else mapS.put(ch1, ch2);
            if(mapT.containsKey(ch2)){
                if(mapT.get(ch2) != ch1) return false;
            }
            else mapT.put(ch2, ch1);
        }
        return true;
    }
}