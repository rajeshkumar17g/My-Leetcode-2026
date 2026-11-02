class Solution {
    public boolean canConstruct(String s1, String s2) {
        
        int[] arr1=new int[26];

        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);

            int index=ch-97;
            arr1[index]++;
        }

         
        int[] arr2=new int[26];

        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);

            int index=ch-97;
            arr2[index]++;
        }

        for(int i=0;i<26;i++){
            if(arr1[i]>arr2[i]){
                return false;
            }
        }

        return true;

    }
}