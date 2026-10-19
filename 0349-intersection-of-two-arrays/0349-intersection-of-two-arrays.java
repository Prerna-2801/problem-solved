class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        Set<Integer> list = new HashSet<>();
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else j++;
            
        }
        int[] ans = new int[list.size()];
        i = 0;
        for(int num: list){
            ans[i++] = num;
        }
        return ans;
    }
}