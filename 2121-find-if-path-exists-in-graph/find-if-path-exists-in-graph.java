class Solution {

    private boolean dfs(ArrayList<Integer>[] adj,boolean[] visited,int source,int destination){

        if(source==destination){
            return true;
        }
        visited[source]=true;

        for(int neigh: adj[source]){
            if(visited[neigh]==false){
                if(dfs(adj,visited,neigh,destination)==true){
                    return true;
                }
            }
        }

        return false;


    }



    public boolean validPath(int n, int[][] edges, int source, int destination) {
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
        /*
        for(int node=0;node<n;node++){
            System.out.println("Node: "+node+"  Neigh: "+adj[node]);
        }*/

        return dfs(adj,visited,source,destination);
    }
}