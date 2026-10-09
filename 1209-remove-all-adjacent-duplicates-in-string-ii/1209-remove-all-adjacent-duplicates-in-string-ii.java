class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair<Character, Integer>> st = new Stack<>();
        for(char ch: s.toCharArray()){
            if(!st.isEmpty() && st.peek().getKey() == ch){
                //matching
                Pair<Character, Integer> head = st.pop();
                st.push(new Pair<>(head.getKey(), head.getValue()+1));
                if(st.peek().getValue() == k) st.pop();
            }
            else{
                st.push(new Pair<>(ch, 1));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            Pair<Character, Integer> head = st.pop();
            int freq = head.getValue();
            for(int i = 0; i<freq; i++){
                sb.append(head.getKey());
            }
        }
        return sb.reverse().toString();
    }
}