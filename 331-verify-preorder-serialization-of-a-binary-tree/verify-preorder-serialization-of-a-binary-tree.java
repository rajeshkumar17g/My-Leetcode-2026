class Solution {
    public boolean isValidSerialization(String preorder) {
        String[] s=preorder.split(",");
        int degree=1;
       for(int i=0;i<s.length;i++){
          degree--; //indegree
          if(degree<0){
            return false;
          }
          if(!s[i].equals("#")){
            degree=degree+2;
          }
       }
       return degree==0;
    }
}