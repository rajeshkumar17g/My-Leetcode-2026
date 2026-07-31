class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n=points.length;
        PriorityQueue<int []> q=new PriorityQueue<>((a,b)->a[1]-b[1]);
        q.offer(new int[]{0,0});
        boolean[] visited=new boolean[n];
        int min_cost=0;

        while(!q.isEmpty()){
            int[] node=q.poll();
            int vertex=node[0];
            int cost=node[1];

            if(visited[vertex]==true){
                continue;
            }
            visited[vertex]=true;
            min_cost+=cost;

            for(int i=0;i<n;i++){
                if(visited[i]==false){
                    int x1=points[vertex][0];
                    int y1=points[vertex][1];

                    int x2=points[i][0];
                    int y2=points[i][1];

                    int dist=Math.abs(x1-x2)+Math.abs(y1-y2);
                    q.offer(new int[]{i,dist});
                }
            }

        }
        return min_cost;
    }
}