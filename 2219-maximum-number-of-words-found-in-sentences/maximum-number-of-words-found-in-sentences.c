int mostWordsFound(char** s, int n) {
        int max=0;
        for(int i=0;i<n;i++){
           
           int count=0;
           for(int index=0;s[i][index]!='\0';index++){
                if(s[i][index]==' '){
                    count++;
                }
           }
           if(count>max){
                max=count;
           }

        }



        return max+1;
}