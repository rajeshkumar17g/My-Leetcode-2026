class Solution {
    public boolean isvowel(char ch){
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
            return true;
        }
        else{
            return false;
        }
    }
    public String reverseVowels(String s) {
        char[] st=s.toCharArray();
        int left=0,right=st.length-1;

        while(left<right){
            while(left<right && isvowel(st[left])==false){
                left++;
            }

            while(left<right && isvowel(st[right])==false){
               right--;
            }

            if(left<right){
                char temp=st[left];
                st[left]=st[right];
                st[right]=temp;
                left++;
                right--;
            }
            
        }

        return String.valueOf(st);
    }
}