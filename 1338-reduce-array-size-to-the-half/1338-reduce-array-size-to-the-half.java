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
        // int ans = Integer.MAX_VALUE;
        // for(int i = 0; i<list.size()-1; i++){
        //     int sum = 0;
        //     cnt = 1;
        //     for(int j = i; j<list.size()-1; j++){
        //         int[] a = list.get(j);
        //         sum += a[1];
        //         if(sum == target){
        //             ans = Math.min(ans, cnt);
        //         }
        //         else if(sum > target){
        //             sum -= a[1];
        //             continue;
        //         }
        //         else cnt++;
        //     }
        // }
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