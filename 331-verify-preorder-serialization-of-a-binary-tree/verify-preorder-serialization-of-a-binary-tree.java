class Solution {
    public boolean isValidSerialization(String preorder) {
        int degree=1;
        String[] pre=preorder.split(",");
        for(int i=0;i<pre.length;i++){
            degree--;
            if(degree<0){
                return false;
            }
            if(!pre[i].equals("#")){
                degree=degree+2;
            }  
        }
        return degree==0;


    }
}