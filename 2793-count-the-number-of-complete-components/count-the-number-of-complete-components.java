class Solution {
    int nodes;
    int e;
    public void dfs( ArrayList<Integer>[] adj, boolean[] visited,int vertex){
        nodes++;
        visited[vertex]=true;
        e=e+adj[vertex].size();
        for(int neigh: adj[vertex]){

            if(visited[neigh]==false){
                dfs(adj,visited,neigh);
            }
        }
    }
    public int countCompleteComponents(int n, int[][] edges) {
        ArrayList<Integer>[] adj=new ArrayList[n];
        boolean[] visited=new boolean[n];


        for(int i=0;i<n;i++){
            adj[i]=new ArrayList<>();
        }

        for(int[] edge: edges){
            int v1=edge[0];
            int v2=edge[1];
            adj[v1].add(v2);
            adj[v2].add(v1);
        }
        int ans=0;
        for(int vertex=0;vertex<n;vertex++){
            if(visited[vertex]==false){
                nodes=0;
                e=0;
                dfs(adj,visited,vertex);

                if((e/2)==nodes*(nodes-1)/2){
                    ans++;
                }
            }
        }

    return ans;

    }
}