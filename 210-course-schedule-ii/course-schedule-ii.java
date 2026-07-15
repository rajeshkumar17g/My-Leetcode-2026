class Solution {
    public int[] findOrder(int n, int[][] edges) {
       ArrayList<Integer>[] adj=new ArrayList[n];
        
        for(int i=0;i<n;i++){
            adj[i]=new ArrayList<>();
        }
        
        int[] indegree=new int[n];
        
        for(int[] edge: edges){
            int v1=edge[0];
            int v2=edge[1];
            
            adj[v2].add(v1); //directed
            indegree[v1]++;
        }
        
        LinkedList<Integer> q=new LinkedList<>();
        
        
        for(int vertex=0;vertex<n;vertex++){
           if(indegree[vertex]==0){
                q.addLast(vertex);
           }
        }
        
        int[] res=new int[n];
       
       int i=0;
       while(!q.isEmpty()){
           
           int vertex=q.removeFirst();
           res[i]=vertex;
           
           for(int neigh: adj[vertex]){
               
               indegree[neigh]--;
               if(indegree[neigh]==0){
                   q.addLast(neigh);
               }
           }
           i++;
       }
      
       return i==n ? res:new int[0];
    }
}