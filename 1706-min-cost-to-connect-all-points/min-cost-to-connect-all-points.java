class Solution {
    public int minCostConnectPoints(int[][] points) {

        PriorityQueue<int[]> q=new PriorityQueue<>((a,b)->a[1]-b[1]);
        boolean[] visited=new boolean[points.length];

        q.offer(new int[] {0,0});
        int mincost=0;

        while(!q.isEmpty()){
            int[] node=q.poll();
            int vertex=node[0];
            int weight=node[1];

            if(visited[vertex]==true){
                continue;
            }

            visited[vertex]=true;
            mincost+=weight;
            for(int neigh=0;neigh<points.length;neigh++){
                if(visited[neigh]==false){
                    int distance=Math.abs(points[vertex][0]-points[neigh][0])+Math.abs(points[vertex][1]-points[neigh][1]);
                    q.offer(new int[]{neigh,distance});
                }
            }
        }

        return mincost;





    }
}