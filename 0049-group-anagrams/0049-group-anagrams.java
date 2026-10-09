class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i<strs.length; i++){
            String s = strs[i];
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            s = new String(arr);
            if(!map.containsKey(s)){
                map.put(s, list.size());
                list.add(new ArrayList<>());
            }
            list.get(map.get(s)).add(strs[i]);
        }
        return list;
    }
}