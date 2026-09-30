class Solution {
    public int compress(char[] chars) {
        // for (int i = 0; i < chars.length; i++){
        //     chars[i] = Character.toLowerCase(chars[i]);
        // }
        int i = 0, idx = 0;
        while(i < chars.length){
            char currChar = chars[i];
            int cnt = 0;
            while(i < chars.length && chars[i] == currChar){
                i++;
                cnt++;
            }
            chars[idx++] = currChar;
            if(cnt > 1){
                String cntStr = String.valueOf(cnt);
                for(char c: cntStr.toCharArray()){
                    chars[idx++] = c;
                }
            }
        }
        return idx;
    }
}