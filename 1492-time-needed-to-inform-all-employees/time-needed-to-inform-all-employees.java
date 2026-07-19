class Solution {

    public int dfs(  ArrayList<Integer>[] adj,int headID, int[] informTime){
        int max=0;
        for(int neigh: adj[headID]){
            max=Math.max(max,dfs(adj,neigh,informTime));
        }
        return max+informTime[headID];
    }



    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        ArrayList<Integer>[] adj=new ArrayList[n];


        for(int i=0;i<n;i++){
            adj[i]=new ArrayList<>();
        }

        for(int i=0;i<n;i++){
            if(manager[i]!=-1){
                adj[manager[i]].add(i);
            }
        }

        return dfs(adj,headID,informTime);
    }
}