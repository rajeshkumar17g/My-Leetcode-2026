class Solution {
    public boolean alnum(char ch){
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' || ch>='0' && ch<='9'){
            return true;
        }
        else{
            return false;
        }
    }
    public char tolowercase(char ch){
        if(ch>='A' && ch<='Z'){
            return (char)(ch+32);
        }
        else{
            return ch;
        }
    }
    public boolean isPalindrome(String s) {
        
        int left=0,right=s.length()-1;

        while(left<right){

            //left should be on an alnum
            while(left<right && alnum(s.charAt(left))==false){
                left++;
            }

             while(left<right && alnum(s.charAt(right))==false){
                right--;
            }

            if(tolowercase(s.charAt(left))!=tolowercase(s.charAt(right))){
                return false;
            }

            left++;
            right--;
        }

        return true;



    }
}

/*

     String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            //alphanumeric
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9')){

                if(ch>='A' && ch<='Z'){
                    res=res+(char)(ch+32);
                }
                else{
                    res=res+ch;
                }
            }
        }


       int left=0,right=res.length()-1;
       while(left<right){
            if(res.charAt(left)!=res.charAt(right)){
                return false;
            }
            left++;
            right--;
       }
       return true;*/