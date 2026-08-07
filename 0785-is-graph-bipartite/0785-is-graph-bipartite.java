class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        // ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        // for(int i = 0; i<n; i++){
        //     adj.add(new ArrayList<>());
        // }
        // for(int[] e: graph){
        //     adj.get(e[0]).add(e[1]);
        //     adj.get(e[1]).add(e[0]);
        // }
        int[] color = new int[n];
        Arrays.fill(color, -1);
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i<n; i++){
            if(color[i] == -1){
                color[i] = 0;
                q.offer(i);
                while(!q.isEmpty()){
                    int u = q.poll();
                    for(int v : graph[u]){
                        if(color[v] == -1){
                            color[v] = 1 - color[u];
                            q.offer(v);
                        } 
                        else if(color[v] == color[u]) return false;
                    }
                }
            }
        }
        return true;
    }
}