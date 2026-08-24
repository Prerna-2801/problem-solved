class Solution {
    public int minSetSize(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        List<int[]> list = new ArrayList<>();
        int cnt = 1;
        for(int i = 1; i<n; i++){
            if(arr[i] != arr[i-1]){
                list.add(new int[]{arr[i-1], cnt});
                cnt = 1;
            }
            else{
                cnt++;
            }
        }
        list.add(new int[]{arr[n - 1], cnt});
        list.sort((a, b) -> b[1] - a[1]);
        int target = n/2;
        int ans = 0,  sum = 0;
        for(int[] e: list){
            sum += e[1];
            ans++;
            if(sum >= target){
                break;
            }
        }
        return ans;
    }
}