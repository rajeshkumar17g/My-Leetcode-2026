class Dsu {
    int[] parent, rank;
    Dsu(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++)
            parent[i] = i;
    }

    int find(int x) {
        if (parent[x] != x)
            parent[x] = find(parent[x]);
        return parent[x];
    }

    boolean union(int u, int v) {
        int pu = find(u);
        int pv = find(v);

        if (pu == pv)
            return false;

        if (rank[pu] < rank[pv]) {
            parent[pu] = pv;
        } else if (rank[pu] > rank[pv]) {
            parent[pv] = pu;
        } else {
            parent[pv] = pu;
            rank[pu]++;
        }

        return true;
    }
}

class Solution {

    public int maxStability(int n, int[][] edges, int k) {

        int low = 0;
        int high = 200000;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (check(n, edges, k, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    private boolean check(int n, int[][] edges, int k, int target) {

        Dsu dsu = new Dsu(n);
        int edge_count = 0;
        int upgrades = 0;

        for (int[] e : edges) {
            if (e[3] == 1) {
                if (!dsu.union(e[0], e[1]))
                    return false;
                edge_count++;
                if (e[2] < target)
                    return false;
            }
        }

        for (int[] e : edges) {
            if (e[3] == 0 && e[2] >= target) {
                if (dsu.union(e[0], e[1]))
                    edge_count++;
            }
        }

        for (int[] e : edges) {
            if (e[3] == 0 && e[2] < target && e[2] * 2 >= target) {
                if (upgrades == k)
                    break;

                if (dsu.union(e[0], e[1])) {
                    upgrades++;
                    edge_count++;
                }
            }
        }

        return edge_count == n - 1;
    }
}
/*
Krushkals MST
Binary Search


*/