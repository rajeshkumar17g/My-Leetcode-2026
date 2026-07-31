class Dsu {
    int[] parent, rank;

    Dsu(int n) {
        parent = new int[n];
        rank = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    void union(int u, int v) {
        int pu = find(u);
        int pv = find(v);

        if (pu == pv) return;

        if (rank[pu] < rank[pv]) {
            parent[pu] = pv;
        } else if (rank[pu] > rank[pv]) {
            parent[pv] = pu;
        } else {
            parent[pv] = pu;
            rank[pu]++;
        }
    }
}

class Solution {
    public int[] minimumCost(int n, int[][] edges, int[][] query) {
        Dsu dsu = new Dsu(n);

        for (int[] edge : edges) {
            dsu.union(edge[0], edge[1]);
        }

        Map<Integer, Integer> componentCost = new HashMap<>();

        for (int[] edge : edges) {
            int root = dsu.find(edge[0]);
            componentCost.put(root,
                    componentCost.getOrDefault(root, edge[2]) & edge[2]);
        }

        int[] ans = new int[query.length];

        for (int i = 0; i < query.length; i++) {
            int u = query[i][0];
            int v = query[i][1];

            if (dsu.find(u) != dsu.find(v)) {
                ans[i] = -1;
            } else {
                ans[i] = componentCost.get(dsu.find(u));
            }
        }

        return ans;
    }
}