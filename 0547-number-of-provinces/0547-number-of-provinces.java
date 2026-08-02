class Solution {
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i<isConnected.length; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i<isConnected.length; i++){
            for(int j = 0; j<isConnected.length; j++){
                if(isConnected[i][j] == 1 && i != j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        boolean[] vis = new boolean[isConnected.length];
        int cnt = 0;
        for(int i = 0; i<isConnected.length; i++){
            if(!vis[i]){
                cnt++;
                dfs(i, adj, vis);
            }
        }
        return cnt;
    }
    public void dfs(int i, ArrayList<ArrayList<Integer>> adj, boolean[] vis){
        vis[i] = true;
        for(int it: adj.get(i)){
            if(!vis[it]){
                dfs(it, adj, vis);
            }
        }
    }
}