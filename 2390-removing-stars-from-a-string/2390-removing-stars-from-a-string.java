class Solution {
    public String removeStars(String s) {
        int skip = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1; i>=0; i--){
            char c = s.charAt(i);
            if(c != '*' && skip == 0) sb.append(c);
            else if(c != '*' && skip != 0) skip--;
            else skip++;
        }
        return sb.reverse().toString();
    }
}