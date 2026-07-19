class Solution {
    public int findCenter(int[][] edge) {
        if(edge[0][0]==edge[1][0] || edge[0][0]==edge[1][1]){
            return edge[0][0];
        }
        return edge[0][1];
    }
}