class Solution {
    public boolean dfs( ArrayList<Integer>[] adj, boolean[] visited,int src,int dest){

        if(src==dest){
            return true;
        }
        visited[src]=true;
        for(int neigh: adj[src]){
            if(visited[neigh]==false){
               if( dfs(adj,visited,neigh,dest) ==true){
                return true;
               }
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int src, int dest) {
        
        ArrayList<Integer>[] adj=new ArrayList[n];
        boolean[] visited=new boolean[n];

        for(int i=0;i<n;i++){
            adj[i]=new ArrayList<>();
        }

        for(int[] edge: edges){
            int u=edge[0];
            int v=edge[1];

            adj[u].add(v);
            adj[v].add(u);
        }


        return dfs(adj,visited,src,dest);

    }
}