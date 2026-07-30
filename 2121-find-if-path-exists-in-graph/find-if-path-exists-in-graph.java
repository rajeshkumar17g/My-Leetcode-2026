class Solution {

    public boolean dfs(List<List<Integer>> adj,boolean[] visited, int src,int dest){
        if(src==dest){
            return true;
        }
        visited[src]=true;
        for(int neigh: adj.get(src)){
            if(visited[neigh]==false){
                if(dfs(adj,visited,neigh,dest)==true){
                    return true;
                }
            }
        }
        return false;

    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=1;i<=n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge: edges){
            int u=edge[0];
            int v=edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] visited=new boolean[n];

        return dfs(adj,visited,source,destination);
    }
}