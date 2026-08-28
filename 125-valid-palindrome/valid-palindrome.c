void toLowercase(char* s){
     for(int index=0;s[index]!='\0';index++){
        if(s[index]>='A' && s[index]<='Z'){
            s[index]=s[index]+32;
        }
    }
}
bool isPalindrome(char* s) {
    printf("Org: %s\n",s);
    toLowercase(s);
    printf("LowerCase: %s\n",s);

    char res[200000];


    int i=0;
    for(int index=0;s[index]!='\0';index++){
         if((s[index]>='a' && s[index]<='z') ||
            (s[index]>='A' && s[index]<='Z') || 
            (s[index]>='0' && s[index]<='9')){
                res[i]=s[index];
                i++;
         }
    }
    res[i]='\0';


    printf("AlphaNumeric: %s",res);
     int left=0;
    int right=i-1;

    while(left<right){
        if(res[left]!=res[right]){
            return false;
        }
        left++;
        right--;
    }
    return true;
}