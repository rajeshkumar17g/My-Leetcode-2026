class Solution {
    public boolean isValidSerialization(String preorder) {
        String[] list=preorder.split(",");
        int degree=1;
        for(String ch: list){
            degree--;
            if(degree<0){
                return false;
            }

            if(!ch.equals("#")){
                degree=degree+2;
            }
        }
        return degree==0;
    }
}