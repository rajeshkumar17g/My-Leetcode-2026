/*
1. Create new edges so that they store their original position
    current [v1,v2,weight]  --> [v1,v2,weight,org_index_pos]
2. Krushkals MST --> DSU
3. Find MST for the graph => original value
4. take every edge => 
    skip => if mst>original mst => crtical edge
    include => if mst==original mst => pseudo critical edge
5. return crtical & pseduo
*/
class Solution {
    class Dsu{
        int[] parent;
        int[] rank;

        Dsu(int n){
            parent=new int[n];
            rank=new int[n];

            for(int i=0;i<n;i++){
                parent[i]=i;
            }
        }


        int find(int x){
            if(parent[x]!=x){
                parent[x]=find(parent[x]); // path compre
            }
            return parent[x];
        }

        boolean union(int v1,int v2){
            int pv1=find(v1);
            int pv2=find(v2);

            if(pv1==pv2){
                return false;
            }

            if(rank[pv1]<rank[pv2]){
                parent[pv1]=pv2;
            }
            else if(rank[pv1]>rank[pv2]){
                parent[pv2]=pv1;
            }
            else{
                parent[pv2]=pv1;
                rank[pv1]++;
            }
            return true;
        }
    }
    public List<List<Integer>> findCriticalAndPseudoCriticalEdges(int n, int[][] edges) {

        int[][] new_edges=new int [edges.length][4];

        for(int i=0;i<edges.length;i++){
            new_edges[i][0]=edges[i][0];   // copying v1
            new_edges[i][1]=edges[i][1];   // copying v2
            new_edges[i][2]=edges[i][2];   // copying w
            new_edges[i][3]=i;   // copying index position in 3rd index => imp
        }

        Arrays.sort(new_edges,(a,b)->a[2]-b[2]);

        int actual_MST=kMST(n,new_edges,-1,-1); // calculating org mst

        List<Integer> critical=new ArrayList<>();
        List<Integer> pseudo=new ArrayList<>();

        // accessing all the edges
        for(int i=0;i<new_edges.length;i++){

            // if i=> skip    -1=> not skiiping
            // include=-1 // we dont have to include
            // include =i // we have to include it

            if(kMST(n,new_edges,i,-1)>actual_MST){
                critical.add(new_edges[i][3]);
            }
            else if(kMST(n,new_edges,-1,i)==actual_MST){
                pseudo.add(new_edges[i][3]);
            }
        }  

        List<List<Integer>> res=new ArrayList<>();
        res.add(critical);
        res.add(pseudo);
        return res;
    }

    public int kMST(int n,int[][] new_edges,int skip,int i){
            
            Dsu dsu=new Dsu(n);
            int min_weight=0;
            int count_edges=0;
            
            if(i!=-1){ // forcefully including the path
                int[] edge=new_edges[i];
                int v1=edge[0];
                int v2=edge[1];
                int w=edge[2];

                if(dsu.union(v1,v2)==true){
                    min_weight+=w;
                    count_edges++;
                }
            }


            for(int j=0;j<new_edges.length;j++){
                if(skip==j){
                    continue;
                }

                int[] edge=new_edges[j];
                int v1=edge[0];
                int v2=edge[1];
                int w=edge[2];

                if(dsu.union(v1,v2)==true){
                    min_weight+=w;
                    count_edges++;
                }
                 if(count_edges==n-1){
                    break;
                 }
            }
            
            if(count_edges<n-1){
                return Integer.MAX_VALUE; // disjoint graphs
            }

            return min_weight;   

    }









}