class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(arr);
        int cnt = 1;
        for(int i = 1; i<arr.length; i++){
            if(arr[i] == arr[i-1]) cnt++;
            else{
                if(set.contains(cnt)) return false;
                set.add(cnt);
                cnt = 1;
            }
        }
        if(set.contains(cnt)) return false;
        set.add(cnt);
        return true;
    }
}
