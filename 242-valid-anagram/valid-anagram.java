class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr=new int[26];

        for(int index=0;index<s.length();index++){
            int i=(int)s.charAt(index)-97;
            arr[i]++;
        }   

        for(int index=0;index<t.length();index++){
            int i=(int)t.charAt(index)-97;
            arr[i]--;
        }

        for(int ele: arr){
            if(ele!=0){
                return false;
            }
        }

        return true;
    }
}