class Solution {
    public boolean isAnagram(String s, String t) {
        
        int[] arr=new int[26];

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            int index=ch-97;
            arr[index]++;
        }


        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);

            int index=ch-97;
            arr[index]--;
        }


        for(int ele: arr){
            if(ele!=0){
                return false;
            }
        }
        return true;




    }
}