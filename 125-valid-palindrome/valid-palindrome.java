class Solution {
    public boolean isPalindrome(String s) {

        int left=0;
        int right=s.length()-1;
        while(left<=right){
            while( left<=right && !(s.charAt(left)>=65 && s.charAt(left)<=90 || 
                  s.charAt(left)>=97 && s.charAt(left)<=122 ||
                  s.charAt(left)>=48 && s.charAt(left)<=57)){
                    left++;
                  }
             while( left<=right && !(s.charAt(right)>=65 && s.charAt(right)<=90 || 
                  s.charAt(right)>=97 && s.charAt(right)<=122 ||
                  s.charAt(right)>=48 && s.charAt(right)<=57)){
                    right--;
                  }
            if(left<=right && Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;







       /*
        s=s.toLowerCase();
        String res="";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>=65 && s.charAt(i)<=90) ||
              (s.charAt(i)>=97 && s.charAt(i)<=122) ||
              (s.charAt(i)>=48 && s.charAt(i)<=57)){
                    res=res+s.charAt(i);
              }
        }
        int left=0,right=res.length()-1;
        while(left<=right){
            if(res.charAt(left)!=res.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;*/












    }
}