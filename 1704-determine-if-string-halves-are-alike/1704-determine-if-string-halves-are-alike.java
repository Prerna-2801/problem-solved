class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        String a = s.substring(0, n/2);
        String b = s.substring(n/2, n);
        int cntA=0, cntB=0;
        for(int i = 0;i< n/2; i++){
            char c = a.charAt(i);
            if(c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' ||c == 'A' ||c == 'E' ||c == 'I' ||c == 'O' ||c == 'U'){
                cntA++;
            }
        }
        for(int i = 0;i< n/2; i++){
            char c = b.charAt(i);
            if(c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' ||c == 'A' ||c == 'E' ||c == 'I' ||c == 'O' ||c == 'U'){
                cntB++;
            }
        }
        if(cntA == cntB) return true;
        return false;
    }
}