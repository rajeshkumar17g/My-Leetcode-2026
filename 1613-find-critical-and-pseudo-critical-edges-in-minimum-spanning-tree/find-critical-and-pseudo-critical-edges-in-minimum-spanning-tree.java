/*
1. Create new edges array with org index position
2. sort the array, calculate KMst -> org_Mst
3. access every edge
    calculate KMst by skiping it
    calculate Kmst by including it
4. if skip_weight> org_weight -> critical
    add org index in crtical array
5. else if include_weight==org -> pseudo
    add org index in pseudo critical array
6. repeat the process for all edges
7. return the final combined ans of crtical+Pseudo critical
*/
class Solution {
    class Dsu{
        int[] parent,rank;
        Dsu(int n){
            parent=new int[n];
            rank=new int[n];

            for(int i=0;i<n;i++){
                parent[i]=i;
            }
        }

        int find(int x){
            if(parent[x]!=x){
                parent[x]=find(parent[x]);
            }
            return parent[x];
        }

        boolean union(int u, int v){
            int pu=find(u);
            int pv=find(v);

            if(pu==pv){
                return false;
            }

            if(rank[pu]<rank[pv]){
                parent[pu]=pv;
            }
            else if(rank[pu]>rank[pv]){
                parent[pv]=pu;
            }
            else{
                parent[pv]=pu;
                rank[pu]++;
            }
            return true;
        }
        
    }
    public int Kmst(int n,int[][] new_edges,int skip,int include){

        Dsu dsu=new Dsu(n);
        int edges_count=0,min_weight=0;
        if(include!=-1){
            int[] edge=new_edges[include];
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];

            if(dsu.union(u,v)==true){
                min_weight=min_weight+w;
                edges_count++;
            }
        }

        for(int i=0;i<new_edges.length;i++){

            if(i==skip){
                continue;
            }
            int[] edge=new_edges[i];
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];
        

            if(dsu.union(u,v)==true){
                min_weight=min_weight+w;
                edges_count++;
                if(edges_count==n-1){
                    break;
                }
            }
        }
        if(edges_count==n-1){
             return min_weight;
        }
        return Integer.MAX_VALUE;
    }

    public List<List<Integer>> findCriticalAndPseudoCriticalEdges(int n, int[][] edges) {

        int[][] new_edges=new int[edges.length][4];

        for(int i=0;i<edges.length;i++){
            new_edges[i][0]=edges[i][0];
            new_edges[i][1]=edges[i][1];
            new_edges[i][2]=edges[i][2]; //weight
            new_edges[i][3]=i; //org_index

        }

        Arrays.sort(new_edges,(a,b)->a[2]-b[2]);
                                 // 3rd value is skip :  passing index to skip,  -1 to (include)
                                 // 4th value is include:  passing (index)->include , -1 to skip
        int org_mst=Kmst(n,new_edges,-1,-1); 

        List<Integer> critical=new ArrayList<>();
        List<Integer> pseudo=new ArrayList<>();

        for(int i=0;i<new_edges.length;i++){
            if(Kmst(n,new_edges,i,-1)>org_mst){
                critical.add(new_edges[i][3]);//org_index
            }
            else if(Kmst(n,new_edges,-1,i)==org_mst){
                pseudo.add(new_edges[i][3]);//org_index
            }
        }

        List<List<Integer>> res=new ArrayList<>();
        res.add(critical);
        res.add(pseudo);
        return res;
    }
}