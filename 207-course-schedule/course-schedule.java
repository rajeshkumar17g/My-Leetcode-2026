class Solution {
    public boolean canFinish(int n, int[][] edges) {
        ArrayList<Integer>[] adj=new ArrayList[n];
       for(int i=0;i<n;i++){
           adj[i]=new ArrayList<>();
       }
       
       ArrayList<Integer> res=new ArrayList<>();
       int[] indegree=new int[n];
       
       for(int i=0;i<edges.length;i++){
           int[] edge=edges[i];
           
           int u=edge[0];
           int v=edge[1];
           adj[u].add(v);
           indegree[v]++;
       }
       
       LinkedList<Integer> q=new LinkedList<>();
       
       for(int i=0;i<n;i++){
           if(indegree[i]==0){
               q.addLast(i);
           }
       }
       
       while(!q.isEmpty()){
           int vertex=q.removeFirst();
           res.add(vertex);
           for(int neigh: adj[vertex]){
               indegree[neigh]--;
               if(indegree[neigh]==0){
                   q.addLast(neigh);
               }
           }
       }
       return res.size()==n;
    }
}