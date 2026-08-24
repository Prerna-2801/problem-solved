class Solution {
    public int countPaths(int n, int[][] roads) {
        final int MOD = 1_000_000_007;
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] road : roads){
            int u = road[0];
            int v = road[1];
            int time = road[2];
            adj.get(u).add(new int[]{v, time});
            adj.get(v).add(new int[]{u, time});
        }
        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        int[] ways = new int[n];
        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));
        dist[0] = 0;
        ways[0] = 1;
        pq.offer(new long[]{0, 0});
        while(!pq.isEmpty()){
            long[] curr = pq.poll();
            long currTime = curr[0];
            int node = (int) curr[1];
            if(currTime > dist[node]) continue;
            for(int[] e : adj.get(node)){
                int neighbor = e[0];
                int time = e[1];
                if(currTime + time < dist[neighbor]){
                    dist[neighbor] = currTime + time;
                    ways[neighbor] = ways[node];
                    pq.offer(new long[]{dist[neighbor], neighbor});
                }
                else if(currTime + time == dist[neighbor]){
                    ways[neighbor] = (ways[neighbor] + ways[node]) % MOD;
                }
            }
        }
        return ways[n-1];
    }
}