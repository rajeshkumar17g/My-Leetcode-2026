class Solution {
    public int strStr(String s1, String s2) {
        for(int i=0;i<=s1.length()-s2.length();i++){
            if(s1.charAt(i)==s2.charAt(0)){
                int flag=0; //its our substring
                for(int j=0;j<s2.length();j++){
                    if(s1.charAt(i+j)!=s2.charAt(j)){
                        flag=1; //itsnot the substring
                        break;
                    }
                }
                if(flag==0){
                    return i;
                }
            }

        }
        return -1;
    }
}