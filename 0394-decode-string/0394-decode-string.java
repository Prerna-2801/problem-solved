class Solution {
    public String decodeString(String s) {
        int n = s.length();
        StringBuilder currString = new StringBuilder();
        Stack<Integer> cntStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        int k = 0;
        for(int i = 0; i<n; i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                k = k*10 + (ch-'0');
            }
            else if(ch == '['){
                cntStack.push(k);
                stringStack.push(currString);
                currString = new StringBuilder();
                k = 0;
            }
            else if(ch == ']'){
                StringBuilder decodedString = stringStack.pop();  
                int currK = cntStack.pop();
                for(int j = 0; j<currK; j++){
                    decodedString.append(currString);
                } 
                currString = decodedString;
            }
            else{
                currString.append(ch);
            }
        }
        return currString.toString();
    }
}