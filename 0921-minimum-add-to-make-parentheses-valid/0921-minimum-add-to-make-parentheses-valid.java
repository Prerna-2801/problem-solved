class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        int cntOpen = 0, cntClose = 0;
        for(int i = 0; i<n; i++){
            if(s.charAt(i) == '(') cntOpen++;
            else if(s.charAt(i) == ')'){
                if(cntOpen > 0) cntOpen--;
                else cntClose++;
            }
        }
        return cntOpen + cntClose;
    }
}