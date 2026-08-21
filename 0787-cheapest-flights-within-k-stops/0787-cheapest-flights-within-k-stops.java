class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<int[]>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] flight: flights){
            int u = flight[0];
            int v = flight[1];
            int p = flight[2];
            adj.get(u).add(new int[]{v, p});
        }
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, src, 0});
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int stop = curr[0];  
            int node = curr[1];
            int cost = curr[2];
            if(stop > k) continue;
            for(int[] v : adj.get(node)){
                int nextNode = v[0];
                int wt = v[1]; 
                if(cost + wt < dist[nextNode] && stop <= k){
                    dist[nextNode] = cost + wt; 
                    q.offer(new int[]{stop + 1, nextNode, cost + wt}); 
                }
            }
        }
        if(dist[dst] == Integer.MAX_VALUE) return -1;
        return dist[dst];
    }
}