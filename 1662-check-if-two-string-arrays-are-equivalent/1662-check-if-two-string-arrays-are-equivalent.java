class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = f(word1);
        String s2 = f(word2);
        if(s1.equals(s2)) return true;
        return false;
    }
    public String f(String[] s){
        String s1 ="";
        for(int i = 0; i< s.length; i++){
            s1 += s[i];
        }
        return s1;
    }
}