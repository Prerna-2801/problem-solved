class Solution {
    public String reverseVowels(String s) {
        List<Character> list = new ArrayList<>();
        int n = s.length();
        for(int i = 0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
                list.add(ch);
            }
        }
        int j = list.size()-1;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
                sb.append(list.get(j));
                j--;
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}