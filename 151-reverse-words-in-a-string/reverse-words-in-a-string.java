class Solution {
    public String reverseWords(String s) {

       String res="";
       int index=0;
       String word="";
       int last;
       for(last=s.length()-1;last>=0;last--){
            if(s.charAt(last)==' '){
                continue;
            }
            else{
                break;
            }
       }

       while(index<=last){
            if(s.charAt(index)==' ' && word==""){
                index++;
            }
            else if(s.charAt(index)==' '){
                res=" "+word+res;
                word="";
                index++;
            }
            else{
                word=word+s.charAt(index);
                index++;
            }

            if(index-1==last){
                res=word+res;
                break;
            }
            
       }
       return res;
    }
}


/*
 String word="";
        String res="";
        int i,last;
        //leading spces
        for(i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                break;
            }
        }
        //trailing spaces
         for(last=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                break;
            }
        }
        char prev=s.charAt(i);
        for(;i<=last;i++){
            char ch=s.charAt(i);

            if(ch!=' '){
                word=word+ch;
            }
            else if(prev!=' '){
                res=" "+word+res;
                word="";
            }
            prev=ch;
        }
        res=word+res;
        return res;
        */