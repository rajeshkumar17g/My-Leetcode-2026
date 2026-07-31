class Dsu{
    int[] parent,rank;
    Dsu(int n){
        parent = new int[n+1];
        rank = new int[n+1];

        for (int i = 0; i <=n; i++) {
            parent[i] = i;
        }
    }
    int find(int x) {
        if(parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    void union(int u, int v) {
        int pu = find(u);
        int pv = find(v);

        if (pu==pv) {
            return;
        } else if (rank[pu] < rank[pv]) {
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
    public int minScore(int n, int[][] roads) {
        
        Dsu dsu=new Dsu(n);

        for (int[] road : roads) {
            dsu.union(road[0], road[1]);
        }

        int minPath = Integer.MAX_VALUE;
        int px = dsu.find(1);

        for (int[] road : roads) {
            int py = dsu.find(road[0]);
            if (px == py) {
                minPath = Math.min(minPath, road[2]);
            }
        }

        return minPath;
    }
}