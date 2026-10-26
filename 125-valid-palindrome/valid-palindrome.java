/*
1. convert all uppercase to lowercase
2. remove all special characters
3. check if its palindrome?

*/
class Solution {
    public boolean isPalindrome(String s) {
        
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
    }
}