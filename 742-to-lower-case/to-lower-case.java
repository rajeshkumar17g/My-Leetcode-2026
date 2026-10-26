class Solution {
    public String toLowerCase(String s) {

        String res="";

        for(int index=0;index<s.length();index++){
            char ch=s.charAt(index);

            if(ch>='A' && ch<='Z'){ //if(ch>=65 && ch<=90)
                res=res+(char)(ch+32);
            }
            else{
                res=res+ch;
            }    
        }

        return res;
    }
}