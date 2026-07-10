class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        for(int i=0;i<s.length();i++){
            int index=s.charAt(i)-97;
            arr1[index]++;
        }
        for(int i=0;i<t.length();i++){
            int index=t.charAt(i)-97;
            arr2[index]++;
        }
        for(int i=0;i<26;i++){
           if(arr1[i]!=arr2[i]){
            return false;
           }
        }
        return true;
       
    }
}