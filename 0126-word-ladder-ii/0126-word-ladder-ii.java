class Solution {
    List<List<String>> ans = new ArrayList<>();
    Map<String, Integer> distance = new HashMap<>();
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        distance.put(beginWord, 1);
        set.remove(beginWord);
        boolean foundEnd = false;
        while(!q.isEmpty()){
            int size = q.size();
            List<String> list = new ArrayList<>();
            for(int i = 0; i < size; i++){
                String curr = q.poll();
                int currDist = distance.get(curr); 
                char[] wordChars = curr.toCharArray();
                for(int j = 0; j < wordChars.length; j++){
                    char originalChar = wordChars[j];
                    for(char c = 'a'; c <= 'z'; c++){
                        if(c == originalChar) continue;
                        wordChars[j] = c;
                        String nextWord = String.valueOf(wordChars);
                        if(set.contains(nextWord)){
                            q.offer(nextWord);
                            set.remove(nextWord);
                            distance.put(nextWord, currDist + 1);
                            list.add(nextWord);
                            if(nextWord.equals(endWord)){
                                foundEnd = true;
                            }
                        }
                    }
                    wordChars[j] = originalChar;
                }
            }
            set.removeAll(list);
            if(foundEnd) break;
        }
        if (!distance.containsKey(endWord)) return ans;
        List<String> seq = new ArrayList<>();
        seq.add(endWord);
        dfs(beginWord, endWord, seq);
        return ans;
    }
    public void dfs(String startWord, String s, List<String> seq){
        if(s.equals(startWord)){
            List<String> dup = new ArrayList<>(seq);
            Collections.reverse(dup);
            ans.add(dup);
        }
        int step = distance.get(s);
        int len = s.length();
        for(int i = 0; i<len; i++){
            char[] charWord = s.toCharArray();
            char originalChar = charWord[i];
            for(char c = 'a'; c <='z'; c++){
                if(c == originalChar) continue;
                charWord[i] = c;
                String nextWord = String.valueOf(charWord);
                if(distance.containsKey(nextWord)){
                    if(distance.get(nextWord) + 1 == step){
                        seq.add(nextWord);
                        dfs(startWord, nextWord, seq);
                        seq.remove(seq.size() - 1);
                    }
                }
            }
        }
    }
}