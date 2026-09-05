class Solution {
    public boolean checkIfPangram(String s) {
        
        for(int ascii=97;ascii<=122;ascii++){
            char ch=(char)ascii;
            int flag=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==ch){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                return false;
            }

        }
        return true;
    }
}