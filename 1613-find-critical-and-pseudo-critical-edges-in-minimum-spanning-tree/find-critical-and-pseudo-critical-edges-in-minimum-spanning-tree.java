/*
1. Create new edges so that they store their original position
    current [v1,v2,weight]  --> [v1,v2,weight,org_index_pos]
2. Krushkals MST --> DSU
3. Find MST for the graph => original value
4. take every edge =>  and we try to skip it (exclude it) 
                        or we include it( by force -> starting with that edge and
                        letting kMST do its job of finding minimum value)

    when we skip => if new_mst>original mst => crtical edge
                    loosing that edge costs us more, so its a crtical one
                    should be included in every MST

    include => if new_mst==original mst => pseudo critical edge
                    its a part of another MST (alternative), 
                    including this edge or excluding it
                    doesnt effect anything, and it contributes to Actual MSt
                    so its a Pseudo edge
5. return crtical & pseduo
*/

class Solution {
     class Dsu{
        int [] parent;
        int [] rank;
        Dsu(int n){
            parent=new int[n];
            rank=new int[n];
            for(int i=0;i<n;i++){
                parent[i]=i;
            }
        }
            public int find(int vertex){
                if(parent[vertex]!=vertex){
                    return parent[vertex]=find(parent[vertex]);
                }
                return parent[vertex]; // or vertex
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
                else  if(rank[pu]>rank[pv]){
                    parent[pv]=pu;
                }
                else{
                    parent[pv]=pu;
                   rank[pv]++;
                }

                 return true;
            }
            
        
    }
    public int Kmst(int n, int[][] edges,int skip,int include){

        Dsu dsu=new Dsu(n);
        int min_weight=0;
        int count=0;

        if(include!=-1){
            int[] edge=edges[include];
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];
           
           if(dsu.union(u,v)==true){
                min_weight+=w;
                count++;
           }
        }


       for(int i=0;i<edges.length;i++){
        int u=edges[i][0];
        int v=edges[i][1];
        int w=edges[i][2];
        int index=edges[i][3];

        if(skip==i){
            continue;
        }

        if(dsu.union(u,v)==true){
            min_weight+=w;
            count++;
            if(count==n-1){
                break;
            }
        }


       }

    if (count<n-1){
        return Integer.MAX_VALUE;
    }

       return min_weight;

    }
    public List<List<Integer>> findCriticalAndPseudoCriticalEdges(int n, int[][] edges) {
        int ec=edges.length,i;
        int[][] new_edges=new int[ec][4];

        for(i=0;i<ec;i++){
            new_edges[i][0]=edges[i][0];  // contains u
            new_edges[i][1]=edges[i][1];  // contains v
            new_edges[i][2]=edges[i][2];  // contains weight
            new_edges[i][3]=i;            // contains index
        }

        Arrays.sort(new_edges,(a,b)->a[2]-b[2]);
        int org_mst=Kmst(n,new_edges,-1,-1); //7

        ArrayList<Integer> critical=new ArrayList<>();
        ArrayList<Integer> pseudo=new ArrayList<>();

        for(i=0;i<ec;i++){
            if(Kmst(n,new_edges,i,-1)>org_mst){
                critical.add(new_edges[i][3]);
            }
            else if(Kmst(n,new_edges,-1,i)==org_mst){
                pseudo.add(new_edges[i][3]);
            }
        }
        
         List<List<Integer>> res=new ArrayList<>();
         res.add(critical);
         res.add(pseudo);
         return res;

    }
}























