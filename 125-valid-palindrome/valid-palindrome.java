class Solution {
    public boolean isPalindrome(String s) {
        
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



    }
}