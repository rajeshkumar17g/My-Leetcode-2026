class Solution {
    public boolean checkIfPangram(String s) {
        
        int[] arr=new int[26];

        for(int i=0;i<s.length();i++){
            int index=s.charAt(i)-97;

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


/*
     for(int ascii=97;ascii<=122;ascii++){
            char ch=(char)ascii;
           
            int flag=0;
            for(int i=0;i<s.length();i++){
                if(ch==s.charAt(i)){
                    flag=1;
                    break;
                }
            }

            if(flag==0){
                return false;
            }
        }


        return true;*/