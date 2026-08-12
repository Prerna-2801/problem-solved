class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        if(!set.contains(endWord)) return 0;
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        int cnt = 1;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i<size; i++){
                String curr = q.poll();
                if(curr.equals(endWord)) return cnt;
                char[] wordChars = curr.toCharArray();
                for(int j = 0; j<wordChars.length; j++){
                    char originalChar =  wordChars[j];
                    for(char c = 'a'; c<= 'z'; c++){
                        if(c == originalChar) continue;
                        wordChars[j] = c;
                        String nextWord = String.valueOf(wordChars);
                        if(set.contains(nextWord)){
                            q.offer(nextWord);
                            set.remove(nextWord);
                        }
                    }
                    wordChars[j] = originalChar;
                }
            }
            cnt++;
        }
        return 0;
    }
}