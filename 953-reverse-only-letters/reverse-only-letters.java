class Solution {
    public boolean isalpha(char ch){
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
            return true;
        }
        return false;
    }
    public String reverseOnlyLetters(String s) {

       int left=0,right=s.length()-1;

       char[] res=s.toCharArray(); 
       
       while(left<right){

        //left is on alphabet
        while(left<right && isalpha(res[left])==false){
            left++;
        }

        //right is on alphabet
        while(left<right && isalpha(res[right])==false){
            right--;
        }


        if(left<right){
            char temp=res[left];
            res[left]=res[right];
            res[right]=temp;
            left++;
            right--;
        }
       // System.out.println("l: "+left+" r: "+right);

        
       }

       return new String(res);
    }
}