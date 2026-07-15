class Solution {
    public boolean canFinish(int n, int[][] edges) {
       ArrayList<Integer>[] adj=new ArrayList[n];
        
        for(int i=0;i<n;i++){
            adj[i]=new ArrayList<>();
        }
        
        int[] indegree=new int[n];
        
        for(int[] edge: edges){
            int v1=edge[0];
            int v2=edge[1];
            
            adj[v1].add(v2); //directed
            indegree[v2]++;
        }
        
        LinkedList<Integer> q=new LinkedList<>();
        
        
        for(int vertex=0;vertex<n;vertex++){
           if(indegree[vertex]==0){
                q.addLast(vertex);
           }
        }
        
        ArrayList<Integer> res=new ArrayList<>();
       
       
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