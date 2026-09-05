class Solution {
    public boolean isalnum(char ch){
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' || ch>='0' && ch<='9'){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isPalindrome(String s) {
        

        int left=0,right=s.length()-1;
        while(left<right){

            while(left<right && isalnum(s.charAt(left))==false){
                left++;
            }

            while(left<right && isalnum(s.charAt(right))==false){
                right--;
            }

            if(left<right && Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }

        return true;

    }
}


/*

        String lc="";
        for(int i=0;i<s.length();i++){

            char ch=s.charAt(i);

            if(ch>='A' && ch<='Z'){
                lc=lc+(char)(s.charAt(i)+32);
            }
            else if((ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
                lc=lc+ch;
            }
        }


       int left=0,right=lc.length()-1;

       while(left<right){
            if(lc.charAt(left)!=lc.charAt(right)){
                return false;
            }
            left++;
            right--;
       }
       return true;

*/