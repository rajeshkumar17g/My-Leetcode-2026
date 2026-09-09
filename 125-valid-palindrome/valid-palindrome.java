class Solution {
    public boolean isPalindrome(String s) {
        
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
       return true;





    }
}