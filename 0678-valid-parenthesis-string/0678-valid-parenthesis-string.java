class Solution {
    public boolean checkValidString(String s) {
        int minOpen = 0, maxOpen = 0;
        for(int  i =0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                minOpen++;
                maxOpen++;
            }
            else if(s.charAt(i) == ')'){
                if(minOpen > 0) minOpen--;
                maxOpen--;
            }
            else{
                if (minOpen > 0) minOpen--;
                maxOpen++;
            }
            if(maxOpen < 0) return false;
        }
        if(minOpen == 0) return true;
        return false;
    }
}