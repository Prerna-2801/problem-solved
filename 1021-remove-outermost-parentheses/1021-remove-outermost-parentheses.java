class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int sum = 0, i = 0, j = 0;
        while(j<s.length()){
            if(s.charAt(j) == '(') sum++;
            else sum--;
            if(sum == 0){
                sb.append(s.substring(i+1,j));
                i = j+1;
            }
            j++;
        }
        return sb.toString();
    }
}