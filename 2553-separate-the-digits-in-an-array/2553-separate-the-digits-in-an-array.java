class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums){
            String s = String.valueOf(num);
            int n = s.length();
            for(int i=0 ;i<n; i++){
                list.add(s.charAt(i) - '0');
            }
        }
        int ans[] = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i]= list.get(i);
        }
        return ans;
    }
}