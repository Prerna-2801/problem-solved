class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i<numCourses; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] i: prerequisites){
            adj.get(i[1]).add(i[0]);
        }
        int[] vis = new int[numCourses];
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i<numCourses; i++){
            if(vis[i] == 0){
                if(hasCycle(i, vis, adj, ans)) return new int[]{};
            }
        }
        int[] res = new int[numCourses];
        for(int i = 0; i<ans.size(); i++){
            res[i] = ans.get(numCourses-i-1);
        }
        return res;
    }
    public boolean hasCycle(int i, int[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans){
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