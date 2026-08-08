class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> ans = new ArrayList<>();
        int n = graph.length;
        int[] vis = new int[n];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i<n; i++){
            for(int e: graph[i]){
                adj.get(i).add(e);
            }
        }
        for(int i = 0; i<n; i++){
            if(vis[i] == 0){
                hasCycle(i, vis, adj, ans);
            }
        }
        Collections.sort(ans);
        return ans;
    }
    public boolean hasCycle(int i, int[] vis, ArrayList<ArrayList<Integer>> adj, List<Integer> ans){
        if(vis[i] == 1) return true;
        if(vis[i] == 2) return false;
        vis[i] = 1;
        for(int v: adj.get(i)){
            if(hasCycle(v, vis, adj, ans)) return true;
        }
        vis[i] = 2;
        ans.add(i);
        return false;
    }
}