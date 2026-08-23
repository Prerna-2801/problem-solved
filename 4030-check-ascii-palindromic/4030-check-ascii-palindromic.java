class Solution {
    public boolean isPalindromic(String s) {
        int n = s.length();
        StringBuilder binaryString = new StringBuilder();
        for(int i = 0; i<n; i++){
            char c = s.charAt(i);
            String binaryChar = Integer.toBinaryString(c);
            while(binaryChar.length() < 8){
                binaryChar = '0' + binaryChar;
            }
            binaryString.append(binaryChar);
        }
        int i = 0, j = binaryString.length()-1;
        while(i < j){
            if(binaryString.charAt(i) != binaryString.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}