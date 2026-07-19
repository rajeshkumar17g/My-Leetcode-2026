class Solution {
    public int minCostConnectPoints(int[][] points) {
        
        int n=points.length;

        PriorityQueue<int []> q=new PriorityQueue<>((a,b)->a[1]-b[1]);
        boolean[] visited=new boolean[n];
        
        q.offer(new int[] {0,0});   //starting from 0  weight costed =0
       
        int min_cost=0;
        
        while(!q.isEmpty()){
            
            int[] edge=q.poll();
            
            int vertex=edge[0];
            int cost=edge[1];
            //System.out.println(vertex+" "+weight);
            if(visited[vertex]==true){
                continue;
            }
            
            min_cost+=cost;
            visited[vertex]=true;
            for(int neigh=0;neigh<n;neigh++){
                
                if(visited[neigh]==false){
                    int distance=Math.abs(points[neigh][0]-points[vertex][0])+Math.abs(points[neigh][1]-points[vertex][1]);
                    q.offer(new int[]{neigh,distance});
                }
            }
        }
          return min_cost; 
    }
}