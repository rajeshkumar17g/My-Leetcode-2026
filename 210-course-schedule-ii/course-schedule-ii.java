class Solution {
    public int[] findOrder(int n, int[][] edges) {
        ArrayList<Integer>[] adj=new ArrayList[n];
        for(int i=0;i<n;i++)
            adj[i]=new ArrayList<>();
        
        int[] indegree=new int[n];
        
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            
            adj[v].add(u);
            indegree[u]++;
        }
        LinkedList<Integer> q=new LinkedList<>();
        
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                q.addLast(i);
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
        
        System.out.println(res);
        if(res.size()<n){
            return new int[]{};
        }

        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=res.get(i);
        }
        return ans;
        
    }
}