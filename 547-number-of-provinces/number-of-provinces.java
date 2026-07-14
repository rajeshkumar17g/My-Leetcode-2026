class Solution {

    private void dfs(int[][] isConnected, int city, boolean[] visited) {
        visited[city] = true;

        for (int next = 0; next < isConnected.length; next++) {
            if (isConnected[city][next] == 1 && !visited[next]) {
                dfs(isConnected, next, visited);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int count = 0;

        for (int city = 0; city < n; city++) {
            if (!visited[city]) {
                count++;
                dfs(isConnected, city, visited);
            }
        }

        return count;
    }
}