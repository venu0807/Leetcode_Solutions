class Solution {

    public class UnionFind{
        int[] parent;
        int[] rank;
        int N;

        public UnionFind(int n){
            this.N = n;
            parent = new int[N];
            rank = new int[N];

            for (int i = 0; i < N; i++){
                parent[i] = i;
                rank[i] = 0;
            }
        }

        public int getParent(int p){
            if (parent[p] == p) return p;

            return parent[p] = getParent(parent[p]);
        }

        public boolean union(int a, int b){
            int pA = getParent(a), pB = getParent(b);

            if (pA == pB) return false;

            int rA = rank[pA], rB = rank[pB];

            if (rA < rB) return union(b, a);

            parent[pB] = pA;
            if (rA == rB){
                rank[pA]++;
            }

            return true;
        }

    }

    public int maxStability(int n, int[][] edges, int k) {
        int mustAdd = 0;
        int maxPossible = Integer.MAX_VALUE;


        UnionFind uf = new UnionFind(n);

        // Validation phase - if n or more edges are "must" then a tree with n-1 edges is impossible
        for (int[] e : edges){
            if (e[3] == 1){
                mustAdd++;
                maxPossible = Math.min(maxPossible, e[2]);

                if (!uf.union(e[0], e[1])) return -1;
            }
        }

        if (mustAdd >= n) return -1;

        // Maximum possible stability is lowest "must" edge
        int lo = 1, hi = maxPossible;

        int best = -1;

        while (lo <= hi){
            int mid = lo + (hi - lo) / 2;

            if (canCreateTree(n, edges, mid, k)){
                best = mid;
                lo = mid + 1;
            }
            else hi = mid - 1;
        }

        return best;
    }

    private boolean canCreateTree(int nodes, int[][] edges, int threshold, int upgrades){
        UnionFind uf = new UnionFind(nodes);

        int added = 0;

        // Phase 1 - add "must" edges
        for (int[] e : edges){
            if (e[3] == 1){
                added++;
                uf.union(e[0], e[1]);
            }
        }

        // Phase 2 - add optional edges that connect two components without an upgrade
        for (int[] e : edges){
            if (e[3] == 0 && e[2] >= threshold){
                if (uf.union(e[0], e[1])) added++;
            }
        }

        // Phase 3 - add optional edges that connect two components with an upgrade
        for (int[] e : edges){
            if (upgrades == 0) break;

            if (e[3] == 0 && e[2] < threshold && (e[2] * 2) >= threshold){
                if (uf.union(e[0], e[1])){
                    upgrades--;
                    added++;
                }
            }
        }

        return added == (nodes - 1);
    }
}