class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String res="";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>=65 && s.charAt(i)<=90) ||
              (s.charAt(i)>=97 && s.charAt(i)<=122) ||
              (s.charAt(i)>=48 && s.charAt(i)<=57)){
                    res=res+s.charAt(i);
              }
        }

        System.out.println(res);
         System.out.println(res);
          System.out.println(res);
           System.out.println(res);
            System.out.println(res);
        int left=0,right=res.length()-1;
        while(left<=right){
            if(res.charAt(left)!=res.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;












    }
}