/*
1. Reverse out graph
2. outdegree
3. out==0 add into q
*/

class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {

        ArrayList<Integer>[] adj=new ArrayList[graph.length];

        for(int i=0;i<graph.length;i++){
            adj[i]=new ArrayList<>();
        }

        int[] outdegree=new int[graph.length];

        for(int i=0;i<graph.length;i++){
            outdegree[i]=graph[i].length;
            for(int neigh: graph[i]){
                adj[neigh].add(i);
            }
        }

        LinkedList<Integer> q=new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(outdegree[i]==0){
                q.addLast(i);
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        while(!q.isEmpty()){
            int vertex=q.removeFirst();
            res.add(vertex);

            for(int neigh: adj[vertex]){
                outdegree[neigh]--;
                if(outdegree[neigh]==0){
                    q.addLast(neigh);
                }
            }
        }


        Collections.sort(res);
        return res;























    }
}