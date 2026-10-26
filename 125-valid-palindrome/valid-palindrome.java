/*
1. convert all uppercase to lowercase
2. remove all special characters
3. check if its palindrome?



        String lwr="";

        for(int index=0;index<s.length();index++){
            char ch=s.charAt(index);

            if(ch>='A' && ch<='Z'){
                lwr=lwr+(char)(ch+32);
            }
            else{
                lwr=lwr+ch;
            }
        }

        String res="";

        for(int index=0;index<lwr.length();index++){
            char ch=lwr.charAt(index);

            if(ch>='A' && ch<='Z' || ch>='a' && ch<='z' || ch>='0' && ch<='9'){
                res=res+ch;
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

        return true;
*/
class Solution {
    public boolean isalnum(char ch){
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9')){
            return true;
        }
        return false;
    }
    public boolean isPalindrome(String s) {
        String res=s.toLowerCase();

        int left=0,right=res.length()-1;

        while(left<right){

            // left should point to alphanumeric
            while(left<right && isalnum(res.charAt(left))==false){
                left++;
            }

            // right should point to alphanumeric
            while(left<right && isalnum(res.charAt(right))==false){
                right--;
            }

            if(left<right && res.charAt(left)!=res.charAt(right)){
                return false;
            }
            left++;
            right--;

        }


        return true;

        
    }
}