class Solution {
    public boolean checkIfPangram(String s) {
        int[] arr=new int[26];

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            int index=ch-97;

            arr[index]=1;
        }

        for(int ele: arr){
            if(ele==0){
                return false;
            }
        }

        return true;



    }
}