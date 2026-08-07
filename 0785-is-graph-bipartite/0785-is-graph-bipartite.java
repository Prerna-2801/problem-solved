class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
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